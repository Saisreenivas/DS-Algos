# DS-Algos
> # Algorithms and Datastructures
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
- [Left View of a Binary Tree](./TreeLeftView.java)
- [Right View of a Binary Tree](./TreeRightView.java)
- [Level Order Traversal](./Practice/LevelOrderTraversal.java)
- [Level Order Traversal Spiral](./Practice/LevelOrderTraversalSpiral.java)
- [Height of a Binary Tree](./Practice/HeightOfBinaryTree.java)
- [Diameter of a Binary Tree](./Practice/DiameterOfBinaryTree.java)
- [Binary Tree Height balanced or not](./Practice/BinaryTreeBalancedOrNot.java)
- [Lowest Common Ancestor(LCA) of a Binary Tree](./Practice/LCA.java)
- [Check if two tree are Identical or not](./Practice/IdenticalTrees.java)

**********************************************************************************

## Binary Tree
- [Maximum Path Sum in a Binary Tree](./Practice/MaximumPathSum.java)
- [Constructing Binary Tree using Inorder and Preorder Traversal](./Practice/BinaryTreeUsingPreOrderAndInOrder.java) ([Optimised](./Practice/BinaryTreeUsingPreOrderAndInOrderOptimized.java))
- [Constructing Binary Tree using Inorder and Postorder Traversal](./Practice/BinaryTreeUsingPostOrderAndInOrder.java)
- [Symmetric Binary Tree](./Practice/SymmetricBinaryTree.java)
- [Check If Binary Tree Is Mirror Of Itself](./Practice/CheckIfBinaryTreeIsMirrorOfItself.java)
- [Flatten a Binary Tree into a LinkedList](./Practice/FlattenABinaryTreeIntoLinkedList.java)

**********************************************************************************

## Binary Search Tree
- [Populate Next Right Pointers of a Tree using constant extra space](./Practice/NextRightPointersOfATree.java)
- [Search Given Key in Binary Search Tree Recursive](./Practice/SearchGivenKeyInBSTRecursive.java)
- [Search Given Key in Binary Search Tree Iterative](./Practice/SearchGivenKeyInBSTIterative.java)
- [Construct a Balanced Binary Search Tree Using given Keys](./Practice/ConstructABalancedBSTUsingGivenKeys.java)
- [Check is Binary Tree a Binary Search Tree or Not](./Practice/CheckIsBTaBSTorNot.java)
- [Lowest Common Ancestor(LCA) of a Binary Search Tree](./Practice/LCAofBST.java)
- [Find the inorder predecessor & successor of a given Key in a Binary Search Tree(BST)](./Practice/InorderPreSucOfAGivenKeyInBST.java)
- [Floor](./Practice/FloorInaBST.java) and [Ceil](./Practice/CeilInaBST.java) in a Binary Search Tree(BST)
- [Kth Smallest element in a Binary Search Tree(BST)](./Practice/KthSmallestInABST.java)
- [Kth Largest element in a Binary Search Tree(BST)](./Practice/KthLargestInABST.java)
- [Find a Pair with a Given Sum in Binary Search Tree(BST)](./Practice/FindAPairWithAGivenSumInBST.java)
- [Binary Search Tree(BST) iterator](./Practice/BSTIterator.java)
- [Size of the largest Binary Search Tree(BST) in a Binary Tree](./Practice/SizeOfLargestBSTInBT.java)
- [Serialize and deserialize Binary Tree](./Practice/SerializeDeserializeABinaryTree.java)

**********************************************************************************

## Mixed Questions
- [Binary Tree to Double Linked List](./Practice/BTtoDLL.java)
- [Find median in a stream of running integers](./Practice/FindMedianInAStreamOfRunningIntegers.java)
- [K-th largest element in a stream](./Practice/KthLargestElementInAStream.java)
- [Distinct numbers in Window](./Practice/DistinctNumbersInAWindow.java)
- [K-th largest element in an unsorted array](./Practice/KthLargestElementInUnsortedArray.java)
- [Flood-fill Algorithm](./Practice/FloodFillAlgorithm.java)

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

# Top View of Binary Tree

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

**********************************************************************************

# Bottom View of Binary Tree

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
