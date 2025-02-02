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
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Used in conjunction with the {@link SqlResultSetMapping} annotation to map the SELECT
 * clause of a SQL query to an entity result.
 *
 * <p>If this annotation is used, the SQL statement should select 
 * all of the columns that are mapped to the entity object. 
 * This should include foreign key columns to related entities. 
 * The results obtained when insufficient data is available 
 * are undefined.
 *
 * <pre>
 *   Example:
 *
 *   Query q = em.createNativeQuery(
 *       "SELECT o.id, o.quantity, o.item, i.id, i.name, i.description "+
 *           "FROM Order o, Item i " +
 *           "WHERE (o.quantity &gt; 25) AND (o.item = i.id)",
 *       "OrderItemResults");
 *   &#064;SqlResultSetMapping(name="OrderItemResults",
 *       entities={
 *           &#064;EntityResult(entityClass=com.acme.Order.class),
 *           &#064;EntityResult(entityClass=com.acme.Item.class)
 *   })
 * </pre>
 *
 * @see SqlResultSetMapping
 *
 * @since Java Persistence 1.0
 */
@Target({}) 
@Retention(RUNTIME)
public @interface EntityResult { 

    /** The class of the result. */
    Class entityClass(); 

    /** 
     * Maps the columns specified in the SELECT list of the 
     * query to the properties or fields of the entity class. 
     */
    FieldResult[] fields() default {};

    /** 
     * Specifies the column name (or alias) of the column in 
     * the SELECT list that is used to determine the type of 
     * the entity instance.
     */
    String discriminatorColumn() default "";
}
