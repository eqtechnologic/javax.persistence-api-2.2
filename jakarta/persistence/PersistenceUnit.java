/*******************************************************************************
 * Copyright (c) 2008 - 2015 Oracle Corporation. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Petros Splinakis - Java Persistence 2.2
 *     Linda DeMichiel - Java Persistence 2.1
 *     Linda DeMichiel - Java Persistence 2.0
 *
 ******************************************************************************/ 
package jakarta.persistence;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * Expresses a dependency on an {@link EntityManagerFactory} and its
 * associated persistence unit.
 *
 * @since Java Persistence 1.0
 */
@Repeatable(PersistenceUnits.class)
@Target({TYPE, METHOD, FIELD})
@Retention(RUNTIME)
public @interface PersistenceUnit {

    /**
     * (Optional) The name by which the entity manager factory is to be accessed 
     * in the environment referencing context;  not needed when 
     * dependency injection is used.
     */
    String name() default "";

    /**
     * (Optional) The name of the persistence unit as defined in the
     * <code>persistence.xml</code> file. If specified, the
     * persistence unit for the entity manager factory that is
     * accessible in JNDI must have the same name.
     */
    String unitName() default "";

}
