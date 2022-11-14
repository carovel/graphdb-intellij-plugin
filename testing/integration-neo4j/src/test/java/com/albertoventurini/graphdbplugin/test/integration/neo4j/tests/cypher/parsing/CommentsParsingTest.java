/**
 * Copied and adapted from plugin
 * <a href="https://github.com/neueda/jetbrains-plugin-graph-database-support">Graph Database Support</a>
 * by Neueda Technologies, Ltd.
 * Modified by Alberto Venturini, 2022
 */
package com.albertoventurini.graphdbplugin.test.integration.neo4j.tests.cypher.parsing;

import com.albertoventurini.graphdbplugin.test.integration.neo4j.tests.cypher.util.BaseParsingTest;

public class CommentsParsingTest extends BaseParsingTest {

    public CommentsParsingTest() {
        super("comments");
    }

    public void testBlock() {
        doTest(true);
    }

    public void testLine() {
        doTest(true);
    }
}
