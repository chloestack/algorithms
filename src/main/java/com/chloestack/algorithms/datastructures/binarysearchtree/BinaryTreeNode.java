package com.chloestack.algorithms.datastructures.binarysearchtree;

public class BinaryTreeNode<T> {

    /**
     * 현재 노드
     */
    private T element;
    /**
     * 왼쪽 노드의 참조
     */
    private BinaryTreeNode<T> left;
    /**
     * 오른쪽 노드의 참조 노드
     */
    private BinaryTreeNode<T> right;


    /**
     * 생성자. 최초 노드는 왼쪽, 오른쪽 노드가 모두 null
     * @param element Specified element
     */
    public BinaryTreeNode(T element){
        this.element = element;
        this.left = null;
        this.right = null;
    }


    /**
     * @return 현재 노드의 부속 노드 수
     */
    public int getNumberOfDescendants(){
        int n = 0;

        if (this.left != null)
            n += 1 + this.left.getNumberOfDescendants();

        if (this.right != null)
            n += 1 + this.right.getNumberOfDescendants();

        return n;
    }


    /**
     * @return 현재 노드의 요소
     */
    public T getElement(){
        return this.element;
    }


    /**
     * @return 왼쪽 노드의 참조 노드 반환
     */
    public BinaryTreeNode<T> getLeft(){
        return this.left;
    }


    /**
     * @return 오른쪽 노드의 참조 노드 반환
     */
    public BinaryTreeNode<T> getRight(){
        return this.right;
    }


    /**
     * 현재 노드에 새로운 요소 삽입
     * @param element Specified element
     */
    public void setElement(T element){
        this.element = element;
    }


    /**
     * 왼쪽 노드에 새로운 노드 삽입
     * @param node Specified node
     */
    public void setLeft(BinaryTreeNode<T> node){
        this.left = node;
    }


    /**
     * 오른쪽 노드에 새로운 노드 삽입
     * @param node Specified node
     */
    public void setRight(BinaryTreeNode<T> node)
    {
        this.right = node;
    }


}
