package cssinliner.plugins;

import java.util.Map;

import play.templates.GroovyTemplate;
import cssinliner.inliner.HtmlCssInliner;

public class MailTemplate extends GroovyTemplate {

	public MailTemplate( String name, String source ) {
		super( name, source );
	}

	public String render( Map<String, Object> args ) {
		String html = super.render(args);
		return HtmlCssInliner.inlinize ( html );
	}
}
