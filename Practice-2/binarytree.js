function TreeNode(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
}

// class TreeNode {
//     constructor(val, left = null, right = null) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }


/**
 * 
 * @param {TreeNode} root 
 * @returns {number}
 */
var findSecondMinimumValue = function (root) {


}

/**
 * 
 * @param {number[]} data 
 * @returns {TreeNode}
 */
function constructLevelOrderFashionTree(data, root, index) {
    if (index >= data.length) {
        return root;
    }
    let tmp = new TreeNode(data[index]);
    root = tmp;
    root.left = constructLevelOrderFashionTree(data, root.left, 2 * index + 1);
    root.right = constructLevelOrderFashionTree(data, root.right, 2 * index + 2);
    return root;
}

/**
 * 
 * @param {TreeNode} root 
 */
function inorder(root) {
    if (root != null) {
        inorder(root.left);
        console.log(root.val);
        inorder(root.right);
    }
}

function main() {
    const data = [2, 2, 5, null, null, 5, 7];
    let root;
    const inputTree = constructLevelOrderFashionTree(data, root, 0);
    inorder(inputTree);

}

main();