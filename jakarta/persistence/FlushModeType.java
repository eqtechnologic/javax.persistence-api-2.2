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
 * Flush mode setting.
 *
 * <p> When queries are executed within a transaction, if
 * <code>FlushModeType.AUTO</code> is set on the {@link
 * jakarta.persistence.Query Query} or {@link jakarta.persistence.TypedQuery
 * TypedQuery} object, or if the flush mode setting for the
 * persistence context is <code>AUTO</code> (the default) and a flush
 * mode setting has not been specified for the <code>Query</code> or
 * <code>TypedQuery</code> object, the persistence provider is
 * responsible for ensuring that all updates to the state of all
 * entities in the persistence context which could potentially affect
 * the result of the query are visible to the processing of the
 * query. The persistence provider implementation may achieve this by
 * flushing those entities to the database or by some other means. 
 * <p> If <code>FlushModeType.COMMIT</code> is set, the effect of
 * updates made to entities in the persistence context upon queries is
 * unspecified.
 *
 * <p> If there is no transaction active or the persistence context is not
 * joined to the current transaction, the persistence provider must not flush 
 * to the database.
 *
 * @since Java Persistence 1.0
 */
public enum FlushModeType {

    /** Flushing to occur at transaction commit.  The provider may flush
     *  at other times, but is not required to.
     */
   COMMIT,

    /** (Default) Flushing to occur at query execution. */
   AUTO
}
