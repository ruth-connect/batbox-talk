package uk.me.ruthmills.batbox.talk.thymeleaf;

import org.thymeleaf.dialect.AbstractDialect;

public class TalkDialect extends AbstractDialect {

	@Override
	public String getPrefix() {
		return "demo";
	}
	
	@Override
	public boolean isLenient() {
		return false;
	}
}
