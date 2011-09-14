package docSample

/*#! scaladoc */
/**
 *
 * If you are having trouble getting the package descriptions to show up with scaladoc, 
 * the following might help:
 *
 *  - Place package description in a file called ''package.scala''</br>
 *  - Make sure the directory structure matches precisely the package structure</br>
 *  - Make sure the ''package.scala'' file is in its corresponding directory</br>
 *
 * The root `package.scala` file should look like:
 *
 * {{{
 * /**
 *  * Scaladoc comments
 *  *
 *  *    Note: No beginning package statement for the root package.
 *  */

 package object rootPackage
 * }}}
 *
 * <br/>
 * A sub `package.scala` file should look like:
 *
 * {{{
 * package rootPackage
 *
 * /**
 *  * Scaladoc comments
 *  *
 *  *    Tip: The package name reads better if it is
 *  *         not the full path name but just the parent name
 *  */

 package object subPackage
 * }}}
 *
 *
 * Back to the beginning, [[docSample]]
 *
 * @author [[http://me@keithpinson.com Keith Pinson]]
 *
 */

package object subCode
