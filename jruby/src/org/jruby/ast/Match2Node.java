/*
 * Match2Node.java - description
 * Created on 01.03.2002, 17:23:26
 * 
 * Copyright (C) 2001, 2002 Jan Arne Petersen
 * Copyright (C) 2004 Thomas E Enebo
 * Jan Arne Petersen <jpetersen@uni-bonn.de>
 * Thomas E Enebo <enebo@acm.org>
 *
 * JRuby - http://jruby.sourceforge.net
 * 
 * This file is part of JRuby
 * 
 * JRuby is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * JRuby is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with JRuby; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 */
package org.jruby.ast;

import org.jruby.ast.visitor.NodeVisitor;
import org.jruby.lexer.yacc.SourcePosition;

/**
 *
 * @author  jpetersen
 * @version $Revision$
 */
public class Match2Node extends Node {
    static final long serialVersionUID = -5637326290741724784L;

    private final Node receiverNode;
    private final Node valueNode;

    public Match2Node(SourcePosition position, Node receiverNode, Node valueNode) {
        super(position);

        this.receiverNode = receiverNode;
        this.valueNode = valueNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(NodeVisitor iVisitor) {
        iVisitor.visitMatch2Node(this);
    }

    /**
     * Gets the receiverNode.
     * @return Returns a Node
     */
    public Node getReceiverNode() {
        return receiverNode;
    }

    /**
     * Gets the valueNode.
     * @return Returns a Node
     */
    public Node getValueNode() {
        return valueNode;
    }
}
