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

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Used in conjunction with the {@link SqlResultSetMapping} annotation to map the SELECT
 * clause of a SQL query to a constructor.
 *
 * <p>Applies a constructor for the target class, passing in as arguments
 * values from the specified columns.  All columns corresponding
 * to arguments of the intended constructor must be specified using the
 * <code>columns</code> element of the <code>ConstructorResult</code>
 * annotation in the same order as that of the argument list of the
 * constructor.  Any entities returned as constructor results will be
 * in either the new or detached state, depending on whether a primary
 * key is retrieved for the constructed object.
 * 
 * <pre>
 *
 * Example:
 *
 *   Query q = em.createNativeQuery(
 *      "SELECT c.id, c.name, COUNT(o) as orderCount, AVG(o.price) AS avgOrder " +
 *      "FROM Customer c, Orders o " +
 *      "WHERE o.cid = c.id " +
 *      "GROUP BY c.id, c.name",
 *      "CustomerDetailsResult");
 *
 *   &#064;SqlResultSetMapping(
 *       name="CustomerDetailsResult",
 *       classes={
 *          &#064;ConstructorResult(
 *               targetClass=com.acme.CustomerDetails.class,
 *                 columns={
 *                    &#064;ColumnResult(name="id"),
 *                    &#064;ColumnResult(name="name"),
 *                    &#064;ColumnResult(name="orderCount"),
 *                    &#064;ColumnResult(name="avgOrder", type=Double.class)
 *                    }
 *          )
 *       }
 *      )
 *
 * </pre>
 *
 * @see SqlResultSetMapping
 * @see ColumnResult
 *
 * @since Java Persistence 2.1
 */
@Target({}) 
@Retention(RUNTIME)

public @interface ConstructorResult { 

    /** (Required) The class whose constructor is to be invoked. */
    Class targetClass();

    /** 
     *  (Required) The mapping of columns in the SELECT list to the arguments
     *  of the intended constructor, in order.
     */
    ColumnResult[] columns();
}
