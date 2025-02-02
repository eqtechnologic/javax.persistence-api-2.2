/*******************************************************************************
 * Copyright (c) 2008 - 2013 Oracle Corporation. All rights reserved.
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
 *     Linda DeMichiel - Java Persistence 2.0
 *
 ******************************************************************************/
package jakarta.persistence;

/**
 * The validation mode to be used by the provider for the persistence
 * unit.
 * 
 * @since Java Persistence 2.0
 */
public enum ValidationMode {
   
    /**
     * If a Bean Validation provider is present in the environment,
     * the persistence provider must perform the automatic validation
     * of entities.  If no Bean Validation provider is present in the
     * environment, no lifecycle event validation takes place.
     * This is the default behavior.
     */
    AUTO,

    /**
     * The persistence provider must perform the lifecycle event
     * validation.  It is an error if there is no Bean Validation
     * provider present in the environment.
     */
    CALLBACK,

    /**
     * The persistence provider must not perform lifecycle event validation.
     */
    NONE
    }
