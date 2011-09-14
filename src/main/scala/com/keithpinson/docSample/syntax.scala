package docSample

/*
 * Copyright (c) 2011 Keith Pinson,
 *
 * Created: 9/11/11 6:55 AM
 *
 * To change this template in IntelliJ use File | Settings | File Templates.
 */

/*#! scaladoc */
/**
 * '''Basic Scaladoc Syntax'''
 *
 * Just like javadoc, scaladoc comments are identified by adding an extra asterisk
 * to the start of the comment block.  So:
 *
 * {{{
 * /**
 *  *
 *  * The double astrisks up there makes everything in this comment a scaladoc comment.
 *  *
 *  */ }}}
 *
 *
 * <br/><br/>Scaladoc implements a markup language like ''Markdown'' or ''Textile'' but it is
 * unique to scaladoc.  Leading spaces and an asterisk are ignored.<br/><br/>
 * &nbsp;&nbsp; A blank line marks a paragraph<br/><br/>
 * &nbsp;&nbsp; Two apostrophes for `''`''italic''`''`<br/><br/>
 * &nbsp;&nbsp; Three apostrophes for `'''`'''bold'''`''''`<br/><br/>
 * &nbsp;&nbsp; Two underbars for `__`__underline__`__`<br/><br/>
 * &nbsp;&nbsp; A single backtick for a &#96;`monospace font`&#96;<br/><br/>
 * &nbsp;&nbsp; A link is made with two square brackets:<br/><br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`[[docSample.subCode]]` becomes an internal link, [[docSample.subCode]]<br/><br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`[[http://scala-lang.org Link to the Scala Language]]` becomes <br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;an external link, [[http://scala-lang.org Link to the Scala Language]]<br/><br/>
 * &nbsp;&nbsp; A single equal sign, like `=heading=`, on a line by itself makes a heading.  Extra == makes sub headings<br/><br/>
 * &nbsp;&nbsp; A block of code is marked with `{{{` on the first line by itself and then `}}}` on the last line<br/><br/>
 * &nbsp;&nbsp; Four hyphens following a blank line makes a horizontal rule
 *
 * ----
 *  - A space and a hyphen forms a bullet point list
 *  - &nbsp;
 *  - &nbsp;
 *  <br/><br/>
 *  1. A space and a `1.` becomes an ordered list, a., A., i., or I. can be used instead
 *  1. &nbsp;
 *  1. &nbsp;
 *  <br/>
 *
 * ----
 * HTML can be inserted into text<br/><br/>
 * &nbsp;&nbsp; &lt;br&gt; forces a new line<br/><br/>
 * &nbsp;&nbsp; &amp;nbsp; forces insertion of a space character<br/><br/>
 * &nbsp;&nbsp; Unicode characters can be inserted, for example &amp;#9816; becomes &#9816; <br/><br/>
 * &nbsp;&nbsp; Entity References can be inserted, like &amp;uarr; becomes &uarr; <br/><br/>
 *
 * @see [[https://wiki.scala-lang.org/display/SW/Syntax Official Scaladoc Page]]<br/>
 * [[http://readthedocs.org/docs/daniel-spewaks-scala-style-guide/en/latest/scaladoc/index.html Spewak's Scala Style Guide]]
 *
 * @author <a href="keithpinson.com">Keith Pinson</a>
 */

class syntax {
  // This is a stub so that we can demo the scaladoc syntax

  /**
   * '''@Tags for a method call'''
   *
   * The following scaladoc comment:
   *
   * {{{
   * /**
   *  * @since 1.5
   *  * @tparam T A type of some sort
   *  * @param x The vertical argument
   *  * @param y The horizontal argument
   *  * @return False because this is an example
   *  * @throws IllegalArgumentException If argument(s) less than zero
   *  *         may not display in your current version
   *  * @example aMethod(-1, 2)
   *  */ }}}
   *
   * results in:
   *
   *  @since 1.5
   *  @tparam T A type of some sort
   *  @param x The vertical argument
   *  @param y The horizontal argument
   *  @return False because this is an example
   *  @throws IllegalArgumentException If argument(s) less than zero
   *  @example aMethod(-1, 2)
   *
   *
   */
  @throws(classOf[IllegalArgumentException])
  def aMethod[T]( x:Int, y:Int ) : Boolean = {
    if( x < (0) || y < (0) )
      throw new IllegalArgumentException("Arguments must not be less than zero")
    else
      false
  }

  /**
   * '''@Tags for a deprecated method call'''
   *
   * The following scaladoc comment:
   *
   * {{{
   * /**
   *  * @deprecated Use [[docSample.syntax.aMethod]] instead
   *  * @param x The vertical argument
   *  * @param y The horizontal argument
   *  * @return False because this is an example
   *  * @throws IllegalArgumentException If argument(s) less than zero
   *  *         may not display in your current version
   *  */ }}}
   *
   * results in:
   *
   *  @deprecated Use [[docSample.syntax.aMethod]] instead
   *  @param x The vertical argument
   *  @param y The horizontal argument
   *  @return False because this is an example
   *  @throws IllegalArgumentException If argument(s) less than zero
   *
   */
  def aOldMethod( x:Int, y:Int ) : Boolean = {

    // The latest version of Scala requires 2 arguments for @deprecated
    // The older versions of Scala only allow 1 argument
    //
    //     @deprecated("use aMethod() instead","1.5")
    //     @deprecated("use aMethod() instead")


    if( x < (0) || y < (0) )
      throw new IllegalArgumentException("Arguments must not be less than zero")
    else
      false
  }
}
