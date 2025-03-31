#include <stdio.h>
#include <stdlib.h>

// Define the structure for an adjacency list node
struct AdjListNode {
    int dest;
    struct AdjListNode* next;
};

// Define the structure for an adjacency list
struct AdjList {
    struct AdjListNode* head;
};

// Define the structure for a graph
struct Graph {
    int V;
    struct AdjList* array;
};

// Function to create a new adjacency list node
struct AdjListNode* newAdjListNode(int dest)
{
    struct AdjListNode* newNode
        = (struct AdjListNode*)malloc(
            sizeof(struct AdjListNode));
    newNode->dest = dest;
    newNode->next = NULL;
    return newNode;
}

// Function to create a graph of V vertices
struct Graph* createGraph(int V)
{
    struct Graph* graph
        = (struct Graph*)malloc(sizeof(struct Graph));
    graph->V = V;
    graph->array = (struct AdjList*)malloc(
        V * sizeof(struct AdjList));
    for (int i = 0; i < V; ++i)
        graph->array[i].head = NULL;
    return graph;
}

// Function to add an edge to an undirected graph
void addEdge(struct Graph* graph, int src, int dest)
{
    // Add an edge from src to dest
    struct AdjListNode* newNode = newAdjListNode(dest);
    newNode->next = graph->array[src].head;
    graph->array[src].head = newNode;

    // Since graph is undirected, add an edge from dest to
    // src also
    newNode = newAdjListNode(src);
    newNode->next = graph->array[dest].head;
    graph->array[dest].head = newNode;
}

// Function to delete an edge from an undirected graph
void deleteEdge(struct Graph* graph, int src, int dest)
{
    struct AdjListNode* temp = graph->array[src].head;
    struct AdjListNode* prev = NULL;

    // Find and remove the node from the adjacency list of
    // src
    while (temp != NULL && temp->dest != dest) {
        prev = temp;
        temp = temp->next;
    }
    if (temp != NULL) {
        if (prev != NULL)
            prev->next = temp->next;
        else
            graph->array[src].head = temp->next;
        free(temp);
    }

    // Since graph is undirected, remove the src from dest's
    // list
    temp = graph->array[dest].head;
    prev = NULL;
    while (temp != NULL && temp->dest != src) {
        prev = temp;
        temp = temp->next;
    }
    if (temp != NULL) {
        if (prev != NULL)
            prev->next = temp->next;
        else
            graph->array[dest].head = temp->next;
        free(temp);
    }
}

// Function to search an edge in the graph
int searchEdge(struct Graph* graph, int src, int dest)
{
    struct AdjListNode* temp = graph->array[src].head;
    while (temp != NULL) {
        if (temp->dest == dest)
            return 1; // Found
        temp = temp->next;
    }
    return 0; // Not Found
}

// A utility function used by DFS
void DFSUtil(int v, int visited[], struct Graph* graph)
{
    visited[v] = 1;
    printf("%d ", v);

    struct AdjListNode* temp = graph->array[v].head;
    while (temp) {
        int adjVertex = temp->dest;
        if (!visited[adjVertex])
            DFSUtil(adjVertex, visited, graph);
        temp = temp->next;
    }
}

// Function to perform DFS on the graph
void DFS(struct Graph* graph, int startVertex)
{
    int* visited = (int*)malloc(graph->V * sizeof(int));
    for (int i = 0; i < graph->V; i++)
        visited[i] = 0;

    DFSUtil(startVertex, visited, graph);
    free(visited);
}

// Function to perform BFS on the graph
void BFS(struct Graph* graph, int startVertex)
{
    int* visited = (int*)malloc(graph->V * sizeof(int));
    for (int i = 0; i < graph->V; i++)
        visited[i] = 0;

    int* queue = (int*)malloc(graph->V * sizeof(int));
    int front = 0;
    int rear = 0;

    visited[startVertex] = 1;
    queue[rear++] = startVertex;

    while (front < rear) {
        int currentVertex = queue[front++];
        printf("%d ", currentVertex);

        struct AdjListNode* temp
            = graph->array[currentVertex].head;
        while (temp) {
            int adjVertex = temp->dest;
            if (!visited[adjVertex]) {
                visited[adjVertex] = 1;
                queue[rear++] = adjVertex;
            }
            temp = temp->next;
        }
    }

    free(queue);
    free(visited);
}

int main()
{
    // Create the graph given in above figure
    int V = 5;
    struct Graph* graph = createGraph(V);
    addEdge(graph, 0, 1);
    addEdge(graph, 0, 4);
    addEdge(graph, 1, 2);
    addEdge(graph, 1, 3);
    addEdge(graph, 1, 4);
    addEdge(graph, 2, 3);
    addEdge(graph, 3, 4);

    printf("Following is Depth First Traversal (starting "
           "from vertex 0)\n");
    DFS(graph, 0);

    printf("\nFollowing is Breadth First Traversal "
           "(starting from vertex 0)\n");
    BFS(graph, 0);

    printf("\nSearching for edge 1-3: %s\n",
           searchEdge(graph, 1, 3) ? "Found" : "Not Found");
    deleteEdge(graph, 1, 3);

    printf("Searching for edge 1-3 after deletion: %s\n",
           searchEdge(graph, 1, 3) ? "Found" : "Not Found");

    return 0;
}
