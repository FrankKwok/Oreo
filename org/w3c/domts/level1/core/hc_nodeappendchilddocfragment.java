
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

package org.w3c.domts.level1.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     If the "newChild" is a DocumentFragment object then
 *     all its content is added to the child list of this node.
 *     
 *     Create and populate a new DocumentFragment object and
 *     append it to the second employee.   After the 
 *     "appendChild(newChild)" method is invoked retrieve the
 *     new nodes at the end of the list, they should be the
 *     two Element nodes from the DocumentFragment.
* @author Curt Arnold
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-184E7107">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-184E7107</a>
* @see <a href="http://www.w3.org/Bugs/Public/show_bug.cgi?id=246">http://www.w3.org/Bugs/Public/show_bug.cgi?id=246</a>
* @see <a href="http://www.w3.org/Bugs/Public/show_bug.cgi?id=247">http://www.w3.org/Bugs/Public/show_bug.cgi?id=247</a>
*/
public final class hc_nodeappendchilddocfragment extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public hc_nodeappendchilddocfragment(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "hc_staff", true);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      NodeList elementList;
      Node employeeNode;
      NodeList childList;
      DocumentFragment newdocFragment;
      Node newChild1;
      Node newChild2;
      Node child;
      String childName;
      java.util.List result = new java.util.ArrayList();
      
      Node appendedChild;
      int nodeType;
      java.util.List expected = new java.util.ArrayList();
      expected.add("em");
      expected.add("strong");
      expected.add("code");
      expected.add("sup");
      expected.add("var");
      expected.add("acronym");
      expected.add("br");
      expected.add("b");
      
      doc = (Document) load("hc_staff", true);
      elementList = doc.getElementsByTagName("p");
      employeeNode = elementList.item(1);
      childList = employeeNode.getChildNodes();
      newdocFragment = doc.createDocumentFragment();
      newChild1 = doc.createElement("br");
      newChild2 = doc.createElement("b");
      appendedChild = newdocFragment.appendChild(newChild1);
      appendedChild = newdocFragment.appendChild(newChild2);
      appendedChild = employeeNode.appendChild(newdocFragment);
      for (int indexN100A2 = 0; indexN100A2 < childList.getLength(); indexN100A2++) {
          child = (Node) childList.item(indexN100A2);
    nodeType = (int) child.getNodeType();
      
      if (equals(1, nodeType)) {
          childName = child.getNodeName();
      result.add(childName);
      }
      }
      assertEqualsAutoCase("element", "nodeNames", expected, result);
        }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level1/core/hc_nodeappendchilddocfragment";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(hc_nodeappendchilddocfragment.class, args);
   }
}

