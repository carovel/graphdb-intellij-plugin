/**
 * Copied and adapted from plugin
 * <a href="https://github.com/neueda/jetbrains-plugin-graph-database-support">Graph Database Support</a>
 * by Neueda Technologies, Ltd.
 * Modified by Alberto Venturini, 2022
 */
package com.albertoventurini.graphdbplugin.language.cypher.completion.providers;

import com.albertoventurini.graphdbplugin.language.cypher.psi.CypherTypes;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import com.albertoventurini.graphdbplugin.language.cypher.CypherLanguage;
import com.albertoventurini.graphdbplugin.language.cypher.completion.metadata.atoms.CypherBuiltInFunctions;
import org.jetbrains.annotations.NotNull;

public final class BuiltInFunctionCompletionProvider extends BaseCompletionProvider {

    public static final ElementPattern<PsiElement> PATTERN = PlatformPatterns
            .psiElement()
            .inside(PlatformPatterns.psiElement(CypherTypes.EXPRESSION))
            .withLanguage(CypherLanguage.INSTANCE);

    @Override
    protected void addCompletions(
            @NotNull final CompletionParameters parameters,
            @NotNull final ProcessingContext context,
            @NotNull final CompletionResultSet result) {
        result.addAllElements(CypherBuiltInFunctions.FUNCTION_LOOKUP_ELEMENTS);
    }
}
