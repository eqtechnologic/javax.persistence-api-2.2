/*******************************************************************************
 * Copyright (c) 2013 Oracle Corporation. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Linda DeMichiel - Java Persistence 2.1
 *
 ******************************************************************************/
package jakarta.persistence;

/**
 * Used to control the application of a constraint.
 * 
 * @since Java Persistence 2.1
 */
public enum ConstraintMode {

    /** Apply the constraint. */
	CONSTRAINT,

    /** Do not apply the constraint. */
	NO_CONSTRAINT,

    /** Use the provider-defined default behavior. */
        PROVIDER_DEFAULT
}
