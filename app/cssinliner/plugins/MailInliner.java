package cssinliner.plugins;

import java.util.Map;

import play.Logger;
import play.Play;
import play.PlayPlugin;
import play.templates.BaseTemplate;
import play.templates.GroovyTemplate;
import play.templates.GroovyTemplateCompiler;
import play.templates.Template;
import play.templates.TemplateCompiler;
import play.templates.TemplateLoader;
import play.vfs.VirtualFile;

public class MailInliner extends PlayPlugin {
	
	private static final String mailFolder = Play.configuration.getProperty ( "mail.folder" );
	
	public Template loadTemplate( VirtualFile file ) {
		
		if ( file.getName() != null && file.relativePath().startsWith( mailFolder ) && file.getName().endsWith( ".html" ) ) {
			MailTemplate mt = (MailTemplate)new MailTemplateCompiler().compile( file );
			return mt;
		}
		return null;
	}
	
}
