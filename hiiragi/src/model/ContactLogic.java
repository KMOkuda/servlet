package model;

import dao.ContactDAO;

public class ContactLogic {
	public void postContact(Contact contact){
		ContactDAO contactDAO = new ContactDAO();
		contactDAO.create(contact);
	}
}
