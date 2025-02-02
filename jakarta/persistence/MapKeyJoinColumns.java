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
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static jakarta.persistence.ConstraintMode.PROVIDER_DEFAULT;

/**
 * Supports composite map keys that reference entities.  
 * <p> The <code>MapKeyJoinColumns</code> annotation groups
 * <code>MapKeyJoinColumn</code> annotations.  When the
 * <code>MapKeyJoinColumns</code> annotation is used, both the
 * <code>name</code> and the <code>referencedColumnName</code>
 * elements must be specified in each of the grouped
 * <code>MapKeyJoinColumn</code> annotations.
 * 
 * @see MapKeyJoinColumn
 * @see ForeignKey
 * 
 * @since Java Persistence 2.0
 */
@Target( { METHOD, FIELD })
@Retention(RUNTIME)
public @interface MapKeyJoinColumns {
	/**
	 * (Required) The map key join columns that are used to map to the entity
	 * that is the map key.
	 */
	MapKeyJoinColumn[] value();

        /**
         *  (Optional) Used to specify or control the generation of a
         *  foreign key constraint when table generation is in effect.
         *  If both this element and the <code>foreignKey</code>
         *  element of any of the <code>MapKeyJoinColumn</code>
         *  elements are specified, the behavior is undefined.  If no
         *  foreign key annotation element is specified in either
         *  location, the persistence provider's default foreign key
         *  strategy will apply.
         *
         *  @since Java Persistence 2.1
         */
        ForeignKey foreignKey() default @ForeignKey(PROVIDER_DEFAULT);
}
