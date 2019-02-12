package controllers;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	// whenever we submit the admission form-->
	// Spring MVC will run setAsText() method of this class -->
	// before performing the data binding task for studentName property-->

	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if (studentName.contains("Mr.") || studentName.contains("Ms.")) {
			setValue(studentName);

		} else {

			setValue("Ms." + studentName); // what ever value you will provide
											// to the setValue method--Spring
											// MVC will use the same value to
											// perform data binding task for
											// studentName property

		}
	}
}
