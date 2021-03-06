/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.token;

/**
 * Project: Voop
 * 
 * File: Token.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class Token {
	
	private String token;
	private TokenType type;
	
	public Token(String token, TokenType type){
		this.token = token;
		this.type = type;
	}
	
	public String getToken(){
		return token;
	}
	
	public TokenType getType(){
		return type;
	}
}
