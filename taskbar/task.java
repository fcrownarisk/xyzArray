import javax.swing.tree.*;
abstract class Tree{
    public DefaultMutableTreeNode root;
    protected DefaultTreeModel getTreeModel;
    private DefaultTreeModel treeModel;
    public DefaultMutableTreeNode getRoot() {
        return root;
    }
    private DefaultMutableTreeNode getParentNode(DefaultMutableTreeNode root){
        DefaultMutableTreeNode parent = (DefaultMutableTreeNode)root.getParent();
        return parent;
    }
    private DefaultMutableTreeNode getChildNode(DefaultMutableTreeNode root, int index){
        DefaultMutableTreeNode child = (DefaultMutableTreeNode)root.getChildAt(index);
        return child;
    }
    protected void setTree(DefaultMutableTreeNode root) {
        this.root = root;
        treeModel = new DefaultTreeModel(root);
        treeModel.setRoot(root);
        treeModel.reload();
    }
}
//import javax.swing.tree.TreePath;
//import javax.swing.tree.TreeCellEditor;
//import javax.swing.tree.TreeCellRenderer;
//import javax.swing.tree.DefaultTreeModel;
//import javax.swing.tree.DefaultMutableTreeNode;