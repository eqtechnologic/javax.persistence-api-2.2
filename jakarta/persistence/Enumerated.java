/*******************************************************************************
 * Copyright (c) 2008 - 2014 Oracle Corporation. All rights reserved.
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

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static jakarta.persistence.EnumType.ORDINAL;

/**
 * Specifies that a persistent property or field should be persisted
 * as a enumerated type.  The <code>Enumerated</code> annotation may
 * be used in conjunction with the <code>Basic</code> annotation, or in
 * conjunction with the <code>ElementCollection</code> annotation when the
 * element collection value is of basic type.  If the enumerated type
 * is not specified or the <code>Enumerated</code> annotation is not
 * used, the <code>EnumType</code> value is assumed to be <code>ORDINAL</code>.
 *
 * <pre>
 *   Example:
 *
 *   public enum EmployeeStatus {FULL_TIME, PART_TIME, CONTRACT}
 *
 *   public enum SalaryRate {JUNIOR, SENIOR, MANAGER, EXECUTIVE}
 *
 *   &#064;Entity public class Employee {
 *       public EmployeeStatus getStatus() {...}
 *       ...
 *       &#064;Enumerated(STRING)
 *       public SalaryRate getPayScale() {...}
 *       ...
 *   }
 * </pre>
 *
 * @see Basic
 * @see ElementCollection
 *
 * @since Java Persistence 1.0
 */
@Target({METHOD, FIELD}) 
@Retention(RUNTIME)
public @interface Enumerated {

    /** (Optional) The type used in mapping an enum type. */
    EnumType value() default ORDINAL;
}
