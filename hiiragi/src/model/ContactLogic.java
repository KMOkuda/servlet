package model;

import java.util.List;

import dao.ContactDAO;

public class ContactLogic {
	public void postContact(Contact contact){
		ContactDAO contactDAO = new ContactDAO();
		contactDAO.create(contact);
	}

	public List<Contact> getContactList(){
		ContactDAO contactDAO = new ContactDAO();
		return contactDAO.read();
	}
}
