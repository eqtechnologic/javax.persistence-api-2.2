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
package jakarta.persistence.criteria;

import java.util.Map;
import jakarta.persistence.metamodel.MapAttribute;

/**
 * The <code>MapJoin</code> interface is the type of the result of
 * joining to a collection over an association or element 
 * collection that has been specified as a <code>java.util.Map</code>.
 *
 * @param <Z> the source type of the join
 * @param <K> the type of the target Map key
 * @param <V> the type of the target Map value
 *
 * @since Java Persistence 2.0
 */
public interface MapJoin<Z, K, V> 
		extends PluralJoin<Z, Map<K, V>, V> {

    /**
     *  Modify the join to restrict the result according to the
     *  specified ON condition and return the join object.  
     *  Replaces the previous ON condition, if any.
     *  @param restriction  a simple or compound boolean expression
     *  @return the modified join object
     *  @since Java Persistence 2.1
     */
    MapJoin<Z, K, V> on(Expression<Boolean> restriction);

    /**
     *  Modify the join to restrict the result according to the
     *  specified ON condition and return the join object.  
     *  Replaces the previous ON condition, if any.
     *  @param restrictions  zero or more restriction predicates
     *  @return the modified join object
     *  @since Java Persistence 2.1
     */
    MapJoin<Z, K, V> on(Predicate... restrictions);

    /**
     * Return the metamodel representation for the map attribute.
     * @return metamodel type representing the <code>Map</code> that is
     *         the target of the join
     */
    MapAttribute<? super Z, K, V> getModel();
    
    /**
     * Create a path expression that corresponds to the map key.
     * @return path corresponding to map key
     */
    Path<K> key();
    
    /**
     * Create a path expression that corresponds to the map value.
     * This method is for stylistic use only: it just returns this.
     * @return path corresponding to the map value
     */
    Path<V> value(); 
    
    /**
     * Create an expression that corresponds to the map entry.
     * @return expression corresponding to the map entry
     */
    Expression<Map.Entry<K, V>> entry();
}
