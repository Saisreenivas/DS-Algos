function Node(element) {
    this.element = element;
    this.next = null;
}

function LinkedList() {
    this.head = null;
    this.length = 0;

    this.add = (element) => {
        var node = new Node(element);
        if (this.head == null) {
            this.head = node;
        } else {
            var currNode = this.head;
            while (currNode.next) {
                currNode = currNode.next;
            }
            currNode.next = node;
        }
        this.length++;
    }

    this.remove = (element) => {
        var currNode = this.head;
        var previousNode;
        if (currNode.element === element) {
            this.head = currNode.next;
        } else {
            while (currNode.element !== element) {
                previousNode = currNode;
                currNode = currNode.next;
            }
            previousNode.next = currNode.next;
        }
        this.length--;
    }

    this.isEmpty = () => {
        return this.length === 0;
    }

    this.isIndexOf = (element) => {
        var currNode = this.head;
        var index = -1;
        while (currNode) {
            index++;
            if (currNode.element === element) {
                return index;
            }
            currNode = currNode.next;
        }
        return -1;
    }

    this.printData = () => {
        let currNode = this.head;
        while (currNode) {
            console.log(currNode.element);
            currNode = currNode.next;
        }
    }
}

const main = () => {
    const myLinkedList = new LinkedList();
    myLinkedList.add("test");
    myLinkedList.add("test2");
    myLinkedList.add("test3");
    myLinkedList.add("test4");
    console.log("length: ", myLinkedList.length);
    console.log("index: ", myLinkedList.isIndexOf("test3"));
    myLinkedList.printData();
}

main();
