import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

@SuppressWarnings("BoundFieldAssignment")
public class MainFrame {
    private JTree tree1;
    private JButton button1;
    private gramatica_decafParser decafParser;

    JFrame f;

    public MainFrame(gramatica_decafParser decafParser){
        f=new JFrame();
        f.setSize(200,200);
        f.setVisible(true);
        this.decafParser = decafParser;
    }

    public void createTree(ParseTree tree){
        DefaultMutableTreeNode main=new DefaultMutableTreeNode("main");

        DefaultMutableTreeNode program=new DefaultMutableTreeNode("program");
        program.add(new DefaultMutableTreeNode(tree.getChild(0).getText()));

        main.add(program);
        DefaultMutableTreeNode curr;
        for (int i = 1; i < tree.getChildCount()-1; i++) {
            curr=new DefaultMutableTreeNode(getName(tree.getChild(i)));
            creatingNodes(curr, tree.getChild(i));
            main.add(curr);
        }
        tree1=new JTree(main);
        f.add(tree1);
    }


    public void creatingNodes(DefaultMutableTreeNode id, ParseTree tree){
        if (tree.getChildCount() >= 1){
            id.add(new DefaultMutableTreeNode(tree.getText()));
        }
        DefaultMutableTreeNode curr;
        for (int i = 1; i < tree.getChildCount(); i++) {
            curr=new DefaultMutableTreeNode(getName(tree.getChild(i)));
            creatingNodes(curr, tree.getChild(i));
            id.add(curr);
        }
    }

    public void error(){
        JOptionPane.showMessageDialog(null, error_handling.error);
    }

    private String getName(ParseTree tree){
        return tree.toStringTree(this.decafParser).split(" ")[0].replaceAll("[()]", "");
    }

}
