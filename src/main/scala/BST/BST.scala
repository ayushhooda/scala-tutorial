package BST

case class BST(
                data: Int,
                left: Option[BST] = None,
                right: Option[BST] = None
              ) {
  
  def getLeftBST: Option[BST] = this.left
  def getRightBST: Option[BST] = this.right
  def getData: Int = this.data

  def insertNode(newNode: Option[BST]): BST = this
  def deleteElement(node: Option[BST]): BST = this
  def findElement(data: Int): Boolean = ???
}

object BST {
  
  val intBST = BST(data = 10)
//  intBST.

}
