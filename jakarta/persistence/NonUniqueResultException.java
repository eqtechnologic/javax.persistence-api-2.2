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
 * Thrown by the persistence provider when {@link
 * Query#getSingleResult Query.getSingleResult()} or {@link
 * TypedQuery#getSingleResult TypedQuery.getSingleResult()} is executed on a
 * query and there is more than one result from the query. This
 * exception will not cause the current transaction, if one is active,
 * to be marked for rollback.
 *
 * @see Query#getSingleResult()
 * @see TypedQuery#getSingleResult()
 *
 * @since Java Persistence 1.0
 */
public class NonUniqueResultException extends PersistenceException {

        /** 
         * Constructs a new <code>NonUniqueResultException</code> exception 
         * with <code>null</code> as its detail message.
         */
	public NonUniqueResultException() {
		super();
	}

        /** 
         * Constructs a new <code>NonUniqueResultException</code> exception 
         * with the specified detail message.
         * @param   message   the detail message.
         */
	public NonUniqueResultException(String message) {
		super(message);
	}
}

