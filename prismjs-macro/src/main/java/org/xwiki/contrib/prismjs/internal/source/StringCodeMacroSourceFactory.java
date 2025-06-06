/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.prismjs.internal.source;

import javax.inject.Named;
import javax.inject.Singleton;

import org.xwiki.component.annotation.Component;
import org.xwiki.contrib.prismjs.source.CodeMacroSource;
import org.xwiki.contrib.prismjs.source.CodeMacroSourceFactory;
import org.xwiki.rendering.macro.source.MacroContentSourceReference;
import org.xwiki.rendering.transformation.MacroTransformationContext;

/**
 * @version $Id: e8d97a04437b28a0d8957fedbbd9dcdb75e8b2de $
 * @since 1.0
 */
@Component
@Singleton
@Named(MacroContentSourceReference.TYPE_STRING)
public class StringCodeMacroSourceFactory implements CodeMacroSourceFactory
{
    @Override
    public CodeMacroSource getContent(MacroContentSourceReference reference, MacroTransformationContext context)
    {
        return new CodeMacroSource(reference, reference.getReference(), null);
    }
}
