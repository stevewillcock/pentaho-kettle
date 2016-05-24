package org.pentaho.di.trans.steps.gpload;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;

public class Const {
  public static boolean isEmpty( CharSequence string ) {
    return string == null || string.length() == 0;
  }
  public static final String CR = System.getProperty( "line.separator" );
  public static String getOS() {
    return System.getProperty( "os.name" );
  }
  public static boolean isEmpty( Object[] array ) {
    return array == null || array.length == 0;
  }
  public static void repl( StringBuffer str, String code, String repl ) {
    if ( ( code == null ) || ( repl == null ) || ( code.length() == 0 ) || ( repl.length() == 0 ) || ( str == null ) || ( str.length() == 0 ) ) {
      return; // do nothing
    }
    String aString = str.toString();
    str.setLength( 0 );
    str.append( aString.replaceAll( Pattern.quote( code ), Matcher.quoteReplacement( repl ) ) );
  }

  public static String NVL( String source, String def ) {
    if ( source == null || source.length() == 0 ) {
      return def;
    }
    return source;
  }

  public static final String FILE_SEPARATOR = System.getProperty( "file.separator" );
  public static final int MARGIN = 4;
  public static final int FORM_MARGIN = 5;
  public static String[] sortStrings( String[] input ) {
    Arrays.sort( input );
    return input;
  }

}
