/*
* generated by Xtext
*/
package net.certware.evidence.hugin.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class NetDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("net/certware/evidence/hugin/parser/antlr/internal/InternalNetDSL.tokens");
	}
}