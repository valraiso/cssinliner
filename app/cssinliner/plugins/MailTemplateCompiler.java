package cssinliner.plugins;

import play.templates.BaseTemplate;
import play.templates.GroovyTemplate;
import play.templates.GroovyTemplateCompiler;
import play.vfs.VirtualFile;

public class MailTemplateCompiler extends GroovyTemplateCompiler {
	
	public BaseTemplate compile( VirtualFile file ) {
		return compile( new MailTemplate( file.relativePath(), file.contentAsString() ) );
	}
}
