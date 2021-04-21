/**
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * 1. Redistributions of source code must retain copyright
 *    statements and notices.  Redistributions must also contain a
 *    copy of this document.
 *
 * 2. Redistributions in binary form must reproduce the
 *    above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other
 *    materials provided with the distribution.
 *
 * 3. The name "Exolab" must not be used to endorse or promote
 *    products derived from this Software without prior written
 *    permission of Exoffice Technologies.  For written permission,
 *    please contact info@exolab.org.
 *
 * 4. Products derived from this Software may not be called "Exolab"
 *    nor may "Exolab" appear in their names without prior written
 *    permission of Exoffice Technologies. Exolab is a registered
 *    trademark of Exoffice Technologies.
 *
 * 5. Due credit should be given to the Exolab Project
 *    (http://www.exolab.org/).
 *
 * THIS SOFTWARE IS PROVIDED BY EXOFFICE TECHNOLOGIES AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * EXOFFICE TECHNOLOGIES OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Copyright 2005 (C) Exoffice Technologies Inc. All Rights Reserved.
 *
 * $Id: ObjectMessageHandler.java,v 1.1 2005/09/04 07:07:12 tanderson Exp $
 */
package org.exolab.jms.tools.migration.proxy;

import java.io.Serializable;
import java.sql.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import org.exolab.jms.message.ObjectMessageImpl;
import org.exolab.jms.persistence.PersistenceException;


/**
 * Handler for messages of type <code>javax.jms.ObjectMessage</code>.
 *
 * @author <a href="mailto:tma@netspace.net.au">Tim Anderson</a>
 * @version $Revision: 1.1 $ $Date: 2005/09/04 07:07:12 $
 */
class ObjectMessageHandler extends AbstractMessageHandler {

    /**
     * Construct a new <code>ObjectMessageHandler</code>.
     *
     * @param destinations the destination store
     * @param connection   the database connection
     */
    public ObjectMessageHandler(DestinationStore destinations,
                                Connection connection) {
        super(destinations, connection);
    }

    /**
     * Returns the type of message that this handler supports.
     *
     * @return the type of message
     */
    protected String getType() {
        return "ObjectMessage";
    }

    /**
     * Create a new message.
     *
     * @return a new message
     * @throws JMSException for any JMS error
     */
    protected Message newMessage() throws JMSException {
        return new ObjectMessageImpl();
    }

    /**
     * Populate the message body.
     *
     * @param body    the message body
     * @param message the message to populate
     * @throws JMSException         for any JMS error
     * @throws PersistenceException for any persistence error
     */
    protected void setBody(Object body, Message message) throws JMSException,
            PersistenceException {
        if (body != null) {
            ObjectMessage object = (ObjectMessage) message;
            if (!(body instanceof Serializable)) {
                throw new JMSException(
                        "Expected Serializable object for ObjectMessage with "
                        + "JMSMessageID=" + message.getJMSMessageID() +
                        " but got type " + body.getClass().getName());
            }
            object.setObject((Serializable) body);
        }
    }

    /**
     * Returns the body of the message.
     *
     * @param message the message
     * @return the body of the message
     * @throws JMSException for any JMS error
     */
    protected Object getBody(Message message) throws JMSException {
        ObjectMessage object = (ObjectMessage) message;
        return object.getObject();
    }

}