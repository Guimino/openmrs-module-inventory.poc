/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.inventorypoc.drugpackage.validator;

import org.openmrs.annotation.Handler;
import org.openmrs.module.inventorypoc.drugpackage.model.DrugPackage;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Handler(supports = { DrugPackage.class })
public class DrugPackageValidator implements Validator {
	
	@Override
	public boolean supports(final Class<?> clazz) {
		return DrugPackage.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(final Object target, final Errors errors) {
		final DrugPackage drugpackage = (DrugPackage) target;
		if (drugpackage == null) {
			errors.reject("error.general");
		}
		
	}
}
