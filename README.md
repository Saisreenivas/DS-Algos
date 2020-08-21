# Algorithms and Datastructures
1. [Substring In a String](#substring-in-a-string)
2. [Tree Traversal](#tree-traversal)
3. [Binary Tree](#binary-tree)
4. [Binary Search Tree](#binary-search-tree)
5. [Mixed Questions](#mixed-questions)
6. [Graphs](#graphs)
7. [Dynamic Programming](#dynamic-programming)
**********************************************************************************

## Substring In a String
- [KMP Algorithm](./KMPAlgorithm.java)

**********************************************************************************

## Tree Traversal
- Inorder Traversal
- Preorder Traversal
- Postorder Traversal
- [Top View of a Binary Tree](#top-view-of-binary-tree)
- [Bottom View of a Binary Tree](#bottom-view-of-binary-tree)
- [Left View of a Binary Tree](#left-view-of-binary-tree)
- [Right View of a Binary Tree](#right-view-of-binary-tree)
- [Level Order Traversal](#level-order-traversal)
- [Level Order Traversal Spiral](#level-order-traversal-spiral)
- [Height of a Binary Tree](#height-of-binary-tree)
- [Diameter of a Binary Tree](#diameter-of-binary-tree)
- [Binary Tree Height balanced or not](#how-to-determine-if-a-binary-tree-is-height-balanced-or-not)
- [Lowest Common Ancestor(LCA) of a Binary Tree](#lowest-common-ancestor-of-binary-tree)
- [Check if two trees are Identical or not](#check-if-two-trees-are-identical)

**********************************************************************************

## Binary Tree
- [Maximum Path Sum in a Binary Tree](#maximum-path-sum-in-binary-tree)
- [Constructing Binary Tree using Inorder and Preorder Traversal](#constructing-binary-tree-using-inorder-and-preorder-traversal)
- [Constructing Binary Tree using Inorder and Postorder Traversal](#constructing-binary-tree-using-inorder-and-postorder-traversal)
- [Symmetric Binary Tree](#symmetric-binary-tree)
- [Check If Binary Tree Is Mirror Of Itself](#check-if-binary-tree-is-mirror-of-itself)
- [Flatten a Binary Tree into a LinkedList](#flatten-binary-tree-into-a-linkedlist)

**********************************************************************************

## Binary Search Tree
- [Populate Next Right Pointers](#populate-next-right-pointers-of-tree-using-constant-extra-space)
- [Search Given Key in Binary Search Tree Recursive and Iterative](#search-given-key-in-binary-search-tree-recursive-and-iterative)
- [Construct a Balanced Binary Search Tree Using given Keys](#construct-balanced-binary-search-tree-using-given-keys)
- [Check is Binary Tree a Binary Search Tree or Not](#check-is-binary-tree-a-binary-search-tree-or-not)
- [Lowest Common Ancestor(LCA) of a Binary Search Tree](#lowest-common-ancestor-of-a-binary-search-tree)
- [Find the inorder predecessor & successor of a given Key in a Binary Search Tree(BST)](#find-the-inorder-predecessor-and-successor-of-a-given-key-in-a-binary-search-tree)
- [Floor in a Binary Search Tree(BST)](#floor-in-a-binary-search-tree)
- [Ceil in a Binary Search Tree(BST)](#ceil-in-a-binary-search-tree)
- [Kth Smallest element in a Binary Search Tree(BST)](#kth-smallest-element-in-a-binary-search-tree)
- [Kth Largest element in a Binary Search Tree(BST)](#kth-largest-element-in-a-binary-search-tree)
- [Find a Pair with a Given Sum in Binary Search Tree(BST)](#find-a-pair-with-a-given-sum-in-binary-search-tree)
- [Binary Search Tree(BST) iterator](#binary-search-tree-iterator)
- [Size of the largest Binary Search Tree(BST) in a Binary Tree](#size-of-the-largest-binary-search-tree-in-a-binary-tree)
- [Serialize and deserialize Binary Tree](#serialize-and-deserialize-binary-tree)

**********************************************************************************

## Mixed Questions
- [Binary Tree to Double Linked List](#binary-tree-to-double-linked-list)
- [Find median in a stream of running integers](#find-median-in-a-stream-of-running-integers)
- [K-th largest element in a stream](#kth-largest-element-in-a-stream)
- [Distinct numbers in Window](#distinct-numbers-in-window)
- [K-th largest element in an unsorted array](#kth-largest-element-in-an-unsorted-array)
- [Flood-fill Algorithm](#flood-fill-algorithm)

**********************************************************************************
->***Work in Progress***<-
## Graphs
- Clone a graph (Not that easy as it looks)
- DFS
- BFS
- Detect A cycle in Undirected Graph/Directed Graph
- Topo Sort
- Number of islands (Do in Grid and Graph both)
- Bipartite Check
- SCC(using KosaRaju’s algo)
- Djisktra’s Algorithm
- Bellman Ford Algo
- Floyd Warshall Algorithm
- MST using Prim’s Algo
- MST using Kruskal’s Algo

**********************************************************************************

## Dynamic Programming
- Max Product Subarray
- Longest Increasing Subsequence
- Longest Common Subsequence
- 0-1 Knapsack
- Edit Distance
- Maximum sum increasing subsequence
- Matrix Chain Multiplication
- Maximum sum path in matrix, (count paths, and similar type do, also backtrack to find the maximum path)
- Coin change
- Subset Sum
- Rod Cutting
- Egg Dropping
- Word Break
- Palindrome Partitioning (MCM Variation)

**********************************************************************************

#### Top View of Binary Tree

Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. Given a binary tree, print the top view of it. The output nodes can be printed in any order.

A node x is there in output if x is the topmost node at its horizontal distance. Horizontal distance of left child of a node x is equal to horizontal distance of x minus 1, and that of right child is horizontal distance of x plus 1.

          1
       /     \
      2       3
     /  \    / \
    4    5  6   7
Top view of the above binary tree is
4 2 1 3 7

        1
      /   \
    2       3
      \   
        4  
          \
            5
             \
               6
Top view of the above binary tree is
2 1 3 6

[Go to Top](#tree-traversal)
**********************************************************************************

#### Bottom View of Binary Tree

Given a Binary Tree, we need to print the bottom view from left to right. A node x is there in output if x is the bottommost node at its horizontal distance. Horizontal distance of left child of a node x is equal to horizontal distance of x minus 1, and that of right child is horizontal distance of x plus 1.

Examples:

                      20
                    /    \
                  8       22
                /   \      \
              5      3      25
                    / \      
                  10    14

For the above tree the output should be 5, 10, 3, 14, 25.

If there are multiple bottom-most nodes for a horizontal distance from root, then print the later one in level traversal. For example, in the below diagram, 3 and 4 are both the bottom-most nodes at horizontal distance 0, we need to print 4.

                   
                      20
                    /    \
                  8       22
                /   \    /   \
              5      3 4     25
                    / \      
                  10    14 
For the above tree the output should be 5, 10, 4, 14, 25.

[Solution](./TreeBottomView.java)

[Go to Top](#tree-traversal)
**********************************************************************************

#### Left View of Binary Tree

Given a Binary Tree, print left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from left side.

Examples:

Input : 

                 1
               /   \
              2     3
             / \     \
            4   5     6             
Output : 1 2 4

Input :

        1
      /   \
    2       3
      \   
        4  
          \
            5
             \
               6
Output :1 2 4 5 6

[Solution](./TreeLeftView.java)

[Go to Top](#tree-traversal)

**********************************************************************************

#### Right View of Binary Tree

Given a Binary Tree, print Right view of it. Right view of a Binary Tree is set of nodes visible when tree is visited from Right side.
Right view of following tree is 1 3 7 8

           1
        /     \
       2        3
     /   \     /  \
    4     5   6    7
                    \
                     8

[Solution](./TreeRightView.java)

[Go to Top](#tree-traversal)

**********************************************************************************

#### Level Order Traversal Spiral

Level order traversal of a tree is breadth first traversal for the tree.

            1
          /   \
        2       3
      /   \
    4       5

Level order traversal of the above tree is 1 2 3 4 5

[Solution](./Practice/LevelOrderTraversalSpiral.java)

[Go to Top](#tree-traversal)

**********************************************************************************

#### Right View of Binary Tree

Write a function to print spiral order traversal of a tree. For below tree, function should print 1, 2, 3, 4, 5, 6, 7.

                  1
                /   \
              2      3
            /   \   /  \
          7     6   5   4

[Solution](./TreeRightView.java)

[Go to Top](#tree-traversal)

**********************************************************************************

#### Height of Binary Tree

Given a binary tree, find height of it. Height of empty tree is 0 and height of below tree is 3.

           1
         /   \
        2     3
       / \
      4   5

[Solution](./Practice/HeightOfBinaryTree.java)

[Go to Top](#tree-traversal)

**********************************************************************************

#### Diameter of Binary Tree

The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes. The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).

![Diameter of a Tree](./images/Diameter-Of-Binary-Tree.png)

[Solution](./Practice/DiameterOfBinaryTree.java)

[Go to Top](#tree-traversal)

**********************************************************************************

#### How to determine if a binary tree is height balanced or not?

A tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of “much farther” and different amounts of work to keep them balanced.
Consider a height-balancing scheme where following conditions should be checked to determine if a binary tree is balanced.
An empty tree is height-balanced. A non-empty binary tree T is balanced if:
1) Left subtree of T is balanced
2) Right subtree of T is balanced
3) The difference between heights of left subtree and right subtree is not more than 1.

The above height-balancing scheme is used in AVL trees. The diagram below shows two trees, one of them is height-balanced and other is not. The second tree is not height-balanced because height of left subtree is 2 more than height of right subtree.


[Solution](./Practice/BinaryTreeBalancedOrNot.java)

[Go to Top](#tree-traversal)

**********************************************************************************

#### Lowest Common Ancestor of Binary Tree

Given a binary tree (not a binary search tree) and two values say n1 and n2, write a program to find the least common ancestor.
Following is definition of LCA from Wikipedia:
Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

The LCA of n1 and n2 in T is the shared ancestor of n1 and n2 that is located farthest from the root. Computation of lowest common ancestors may be useful, for instance, as part of a procedure for determining the distance between pairs of nodes in a tree: the distance from n1 to n2 can be computed as the distance from the root to n1, plus the distance from the root to n2, minus twice the distance from the root to their lowest common ancestor.

![lca](./images/lca.png)

[Solution](./Practice/LCA.java)

[Go to Top](#tree-traversal)

**********************************************************************************

#### Check if two trees are Identical

Two trees are identical when they have same data and arrangement of data is also same.
To identify if two trees are identical, we need to traverse both trees simultaneously, and while traversing we need to compare data and children of the trees.


[Solution](./Practice/IdenticalTrees.java)

[Go to Top](#tree-traversal)

**********************************************************************************

### Binary Tree

#### Maximum Path Sum in Binary Tree

Given a binary tree, find the maximum path sum. The path may start and end at any node in the tree.

Example:

Input: Root of below tree

       1
      / \
     2   3
Output: 6

See below diagram for another example.
1+2+3
![max-path-sum](./images/max-path-sum.png)

[Solution](./Practice/MaximumPathSum.java)

[Go to Top](#binary-tree)

**********************************************************************************

#### Constructing Binary Tree using Inorder and Preorder Traversal

Write an efficient algorithm to construct a binary tree from given inorder and preorder sequence.

For example,

Input:
 
Inorder Traversal:  { 4, 2, 1, 7, 5, 8, 3, 6 }
Preorder Traversal: { 1, 2, 4, 3, 5, 7, 8, 6 }
 
 
Output: Below binary tree

![binary-tree-using-inorder-and-preorder-traversal](./images/binary-tree-from-inorder-preorder-traversal.png)

[Solution](./Practice/BinaryTreeUsingPreOrderAndInOrder.java)

[Optimised Solution](./Practice/BinaryTreeUsingPreOrderAndInOrderOptimized.java)

[Go to Top](#binary-tree)

**********************************************************************************

#### Constructing Binary Tree using Inorder and Postorder Traversal

Given Postorder and Inorder traversals, construct the tree.

Examples:

Input : 
in[]   = {2, 1, 3}
post[] = {2, 3, 1}

Output : Root of below tree

        1
      /   \
     2     3 


Input : 
in[]   = {4, 8, 2, 5, 1, 6, 3, 7}
post[] = {8, 4, 5, 2, 6, 7, 3, 1} 

Output : Root of below tree

             1
          /      \
         2        3
       /   \    /   \
      4     5  6     7
        \
         8

[Solution](./Practice/BinaryTreeUsingPostOrderAndInOrder.java)

[Go to Top](#binary-tree)

**********************************************************************************

# Symmetric Binary Tree

Given a binary tree, check whether it is a mirror of itself.

For example, this binary tree is symmetric:

           1
         /   \
        2     2
       / \   / \
      3   4 4   3
But the following is not:

      1
     / \
    2   2
     \   \
     3    3

[Solution](./Practice/SymmetricBinaryTree.java)

[Go to Top](#binary-tree)

**********************************************************************************

# Check if Binary Tree is Mirror of Itself

Given a binary tree, check whether it is a mirror of itself.

For example, this binary tree is symmetric:

           1
         /   \
        2     2
       / \   / \
      3   4 4   3
But the following is not:

      1
     / \
    2   2
     \   \
     3    3

[Solution](./Practice/CheckIfBinaryTreeIsMirrorOfItself.java)

[Go to Top](#binary-tree)

**********************************************************************************

# Flatten Binary Tree Into a LinkedList

Given a binary tree, flatten it to a linked list in-place.

For example, given the following tree:

            1
           / \
          2   5
         / \   \
        3   4   6
The flattened tree should look like:

        1
         \
          2
           \
            3
             \
              4
               \
                5
                 \
                  6
[Solution](./Practice/FlattenABinaryTreeIntoLinkedList.java)

[Go to Top](#binary-tree)

**********************************************************************************
### Binary Search Tree

#### Populate Next Right Pointers of Tree using constant extra space

Write a function to connect all the adjacent nodes at the same level in a binary tree. Structure of the given Binary Tree node is like following.

    struct node { 
      int data; 
      struct node* left; 
      struct node* right; 
      struct node* nextRight; 
    } 
Initially, all the nextRight pointers point to garbage values. Your function should set these pointers to point next right for each node. You can use only constant extra space.

Example:

Input Tree

         A
        / \
       B   C
      / \   \
     D   E   F

Output Tree

         A--->NULL
        / \
       B-->C-->NULL
      / \   \
     D-->E-->F-->NULL

[Solution](./Practice/NextRightPointersOfATree.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Search Given Key in Binary Search Tree Recursive and Iterative

![Search Given Key in Binary Search Tree](./images/BST-Search-for-specific-key.png)

[Recursive Solution](./Practice/SearchGivenKeyInBSTRecursive.java)

[Iterative Solution](./Practice/SearchGivenKeyInBSTIterative.java)

[Go to Top](#binary-search-tree)

**********************************************************************************

#### Construct Balanced Binary Search Tree Using given Keys

Given an unsorted array of integers which represents binary search tree keys, construct a height balanced BST from it.

![Array to Balanced BST](./images/Array-to-Balanced-BST.png)

[Solution](./Practice/ConstructABalancedBSTUsingGivenKeys.java)

[Go to Top](#binary-search-tree)

**********************************************************************************

#### Check is Binary Tree a Binary Search Tree or Not

A binary search tree (BST) is a node based binary tree data structure which has the following properties.
• The left subtree of a node contains only nodes with keys less than the node’s key.
• The right subtree of a node contains only nodes with keys greater than the node’s key.
• Both the left and right subtrees must also be binary search trees.

From the above properties it naturally follows that:
• Each node (item in the tree) has a distinct key.

![binary-search-tree](./images/binary-tree-is-bst-or-not.gif)

[Solution](./Practice/CheckIsBTaBSTorNot.java)

[Go to Top](#binary-search-tree)

**********************************************************************************

#### Lowest Common Ancestor of a Binary Search Tree

Given values of two values n1 and n2 in a Binary Search Tree, find the Lowest Common Ancestor (LCA). You may assume that both the values exist in the tree.

Examples:

Tree: 
![BST_LCA](./images/BST_LCA.gif)

**Input:** LCA of 10 and 14
**Output:**  12
**Explanation:** 12 is the closest node to both 10 and 14 
which is a ancestor of both the nodes.

**Input:** LCA of 8 and 14
**Output:**  8
**Explanation:** 8 is the closest node to both 8 and 14 
which is a ancestor of both the nodes.

**Input:** LCA of 10 and 22
**Output:**  20
**Explanation:** 20 is the closest node to both 10 and 22 
which is a ancestor of both the nodes.

[Solution](./Practice/LCAofBST.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Find the inorder predecessor and successor of a given Key in a Binary Search Tree

Given a BST and a key. The task is to find the inorder successor and predecessor of the given key. In case, if either of predecessor or successor is not present, then print -1.

Examples:

Input:

                50
               /  \
              /    \
            30     70
           / \     / \
          /   \   /   \
         20   40 60   80
            key = 65
Output: Predecessor : 60
        Successor : 70

Input:

                50
               /  \
              /    \
            30     70
           / \     / \
          /   \   /   \
         20   40 60   80
            key = 100
Output: predecessor : 80
        successor : -1
Explanation: As no node in BST has key value greater than 100 so -1 is printed for successor.


[Solution](./Practice/InorderPreSucOfAGivenKeyInBST.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Floor in a Binary Search Tree
Given a Binary Search Tree and a number x, find floor of x in the given BST.

Input : x = 14 and root of below tree

            10
           /  \
          5    15
              /  \
            12    30
Output : 12

Input : x = 15 and root of below tree

            10
           /  \
          5    15
              /  \
            12    30
Output : 15    

[Floor Solution](./Practice/FloorInaBST.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Ceil in a Binary Search Tree

Ceil of a node in a given binary search tree is defined as a node that is equal to or nearest maximum node of the given node.

Let’s take the below picture, which demonstrates the ceiling node of the input node.

![ceil-of-bst](./images/ceil-of-bst.png)
Node 24 is minimum node which is greater than given 20.

[Ceil Solution](./Practice/CeilInaBST.java)

[Go to Top](#binary-search-tree)
**********************************************************************************

#### Kth Smallest element in a Binary Search Tree

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

**Example 1:**

    Input: root = [3,1,4,null,2], k = 1
       3
      / \
     1   4
      \
       2
    Output: 1

**Example 2:**

    Input: root = [5,3,6,2,4,null,null,1], k = 3
           5
          / \
         3   6
        / \
       2   4
      /
     1
    Output: 3

**Constraints:**
- The number of elements of the BST is between 1 to 10^4.
- You may assume k is always valid, 1 ≤ k ≤ BST's total elements.


[Solution](./Practice/KthSmallestInABST.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Kth Largest element in a Binary Search Tree

Given a Binary Search Tree (BST) and a positive integer k, find the k’th largest element in the Binary Search Tree.
For example, in the following BST, if k = 3, then output should be 14, and if k = 5, then output should be 10.

![kth-largest-bst-image](./images/kth-largest-bst.gif)

[Solution](./Practice/KthLargestInABST.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Find a Pair with a Given Sum in Binary Search Tree

Given a BST and a sum, find if there is a pair with given sum.

Input : sum = 28
        Root of below tree

![bst image](./images/pair-with-given-sum-in-bst.png)

Output : Pair is found (16, 12)

[Solution](./Practice/FindAPairWithAGivenSumInBST.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Binary Search Tree iterator

Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

 
Example:

![bst tree](./images/bst-tree-iterator.png)


    BSTIterator iterator = new BSTIterator(root);
    iterator.next();    // return 3
    iterator.next();    // return 7
    iterator.hasNext(); // return true
    iterator.next();    // return 9
    iterator.hasNext(); // return true
    iterator.next();    // return 15
    iterator.hasNext(); // return true
    iterator.next();    // return 20
    iterator.hasNext(); // return false
 

**Note:**

- next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
- You may assume that next() call will always be valid, that is, there will be at least a next smallest number in the BST when next() is called.

[Solution](./Practice/BSTIterator.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Size of the largest Binary Search Tree in a Binary Tree

Given a Binary Tree, write a function that returns the size of the largest subtree which is also a Binary Search Tree (BST). If the complete Binary Tree is BST, then return the size of the whole tree.

Examples:

Input: 

          5
         /  \
        2    4
       /  \
      1    3

Output: 3 
The following subtree is the 
maximum size BST subtree 

        2  
       /  \
      1    3


Input:

               50
             /     \
           30       60
          /  \     /   \ 
         5   20   45    70
                      /  \
                    65    80
Output: 5
The following subtree is the
maximum size BST subtree 

        60
       /  \ 
      45    70
           /  \
         65    80

[Solution](./Practice/SizeOfLargestBSTInBT.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Serialize and deserialize Binary Tree

Serialization is to store tree in a file so that it can be later restored. The structure of tree must be maintained. Deserialization is reading tree back from file.

![serialize and deserialize image](./images/serialize-and-deserialize.jpg)


[Solution](./Practice/SerializeDeserializeABinaryTree.java)

[Go to Top](#binary-search-tree)

**********************************************************************************
#### Binary Tree to Double Linked List

Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (left most node in BT) must be head node of the DLL.

![BT to DLL Image](./images/TreeToDLL.png)

[Solution](./Practice/BTtoDLL.java)

[Go to Top](#mixed-questions)
**********************************************************************************
#### Find median in a stream of running integers

Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

For example,
[2,3,4], the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

- void addNum(int num) - Add a integer number from the data stream to the data structure.
- double findMedian() - Return the median of all elements so far.
 

**Example:**

    addNum(1)
    addNum(2)
    findMedian() -> 1.5
    addNum(3) 
    findMedian() -> 2

[Solution](./Practice/FindMedianInAStreamOfRunningIntegers.java)

[Go to Top](#mixed-questions)
**********************************************************************************
#### K-th largest element in a stream

Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.

**Example:**

    int k = 3;
    int[] arr = [4,5,8,2];
    KthLargest kthLargest = new KthLargest(3, arr);
    kthLargest.add(3);   // returns 4
    kthLargest.add(5);   // returns 5
    kthLargest.add(10);  // returns 5
    kthLargest.add(9);   // returns 8
    kthLargest.add(4);   // returns 8
    
**Note:**
You may assume that nums' length ≥ k-1 and k ≥ 1.


[Solution](./Practice/KthLargestElementInAStream.java)

[Go to Top](#mixed-questions)
**********************************************************************************
#### Distinct numbers in Window

Problem Description

You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size **N-B+1** where **i'th** element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

**NOTE:** if **B > N**, return an empty array.



**Input Format**
First argument is an integer array A
Second argument is an integer B.



**Output Format**
Return an integer array.



**Example Input**
Input 1:

    A = [1, 2, 1, 3, 4, 3]
    B = 3
Input 2:

    A = [1, 1, 2, 2]
    B = 1


**Example Output**
Output 1:

    [2, 3, 3, 2]
Output 2:

    [1, 1, 1, 1]


**Example Explanation**
Explanation 1:

    A=[1, 2, 1, 3, 4, 3] and B = 3
    All windows of size B are
    [1, 2, 1]
    [2, 1, 3]
    [1, 3, 4]
    [3, 4, 3]
    So, we return an array [2, 3, 3, 2].
Explanation 2:

    Window size is 1, so the output array is [1, 1, 1, 1].

[Solution](./Practice/DistinctNumbersInAWindow.java)

[Go to Top](#mixed-questions)
**********************************************************************************
#### K-th largest element in an unsorted array

Given an array and a number k where k is smaller than the size of the array, we need to find the k’th largest element in the given array. It is given that all array elements are distinct.

**Examples:**

    Input: arr[] = {7, 10, 4, 3, 20, 15}
          k = 3
    Output: 10

    Input: arr[] = {7, 10, 4, 3, 20, 15}
          k = 4
    Output: 7

[Solution](./Practice/KthLargestElementInUnsortedArray.java)

[Go to Top](#mixed-questions)
**********************************************************************************
#### Flood-fill Algorithm

In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced with a new selected color. Following is the problem statement to do this task.
Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all adjacent same colored pixels with the given color.

**Example:**

    Input:
          screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1, 0, 0},
                          {1, 0, 0, 1, 1, 0, 1, 1},
                          {1, 2, 2, 2, 2, 0, 1, 0},
                          {1, 1, 1, 2, 2, 0, 1, 0},
                          {1, 1, 1, 2, 2, 2, 2, 0},
                          {1, 1, 1, 1, 1, 2, 1, 1},
                          {1, 1, 1, 1, 1, 2, 2, 1},
                          };
        x = 4, y = 4, newColor = 3
    The values in the given 2D screen indicate colors of the pixels.
    x and y are coordinates of the brush, newColor is the color that
    should replace the previous color on screen[x][y] and all surrounding
    pixels with same color.

    Output:
    Screen should be changed to following.
          screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1, 0, 0},
                          {1, 0, 0, 1, 1, 0, 1, 1},
                          {1, 3, 3, 3, 3, 0, 1, 0},
                          {1, 1, 1, 3, 3, 0, 1, 0},
                          {1, 1, 1, 3, 3, 3, 3, 0},
                          {1, 1, 1, 1, 1, 3, 1, 1},
                          {1, 1, 1, 1, 1, 3, 3, 1},
                          };


[Solution](./Practice/FloodFillAlgorithm.java)

[Go to Top](#mixed-questions)
**********************************************************************************
