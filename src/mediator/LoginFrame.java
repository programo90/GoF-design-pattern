package mediator;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator{
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOK;
	private ColleagueButton buttonCancel;
	
	public LoginFrame(String title) {
		super(title);
		
		setBackground(Color.lightGray);
		setLayout(new GridLayout());
		createColleagues();
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username : "));
		add(textUser);
		add(new Label("Password : "));
		add(textPass);
		add(textPass);
		add(buttonOK);
		add(buttonCancel);
		
		colleagueChanged();
		pack();
		show();
	}
	
	public void createColleagues() {
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		buttonOK = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOK.setMediator(this);
		buttonCancel.setMediator(this);
		
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOK.addActionListener(this);
		buttonCancel.addActionListener(this);
		
	}
	
	//Colleague���� ������ Colleague�� ��/��ȿ�� �Ǵ��Ѵ�.
	public void colleagueChanged() {
		if(checkGuest.getState()) {
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOK.setColleagueEnabled(true);
		} else {
			textUser.setColleagueEnabled(true);
			userpassChanged();
		}
	}
	
	//textUser�� textPass�� ������ �߻��� �� Colleague�� ��/��ȿ�� �Ǵ��Ѵ�.
	private void userpassChanged() {
		if(textUser.getText().length() >0) { 
			textPass.setColleagueEnabled(true);
			if(textPass.getText().length() > 0) {
				buttonOK.setColleagueEnabled(true);
			} else {
				buttonOK.setColleagueEnabled(false);
			}
		} else {
			textPass.setColleagueEnabled(false);
			buttonOK.setColleagueEnabled(false);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
			System.out.println(e.toString());
			System.exit(0);
	}
}
