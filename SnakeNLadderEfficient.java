package snakeandladdergame;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class SnakeNLadderEfficient {

	
		public void init() {
			Scanner sc = new Scanner(System.in);
			int T = i(sc);

			while (T-- > 0) {
				int[] B = new int[100];
				Arrays.fill(B, -1);
				// Enter the number of ladders
				int L = i(sc);
				for (int i = 0; i < L; i++) {
					// enter the source of the ladder
					int from = i(sc);
					// enter the destination of the ladder
					int to = i(sc);
					B[from - 1] = to - 1;
				}
				// enter the number of snakes
				int S = i(sc);
				for (int i = 0; i < S; i++) {
					// enter the source of the snake
					int from = i(sc);
					// enter the destination of snake
					int to = i(sc);
					B[from - 1] = to - 1;
				}
				findPath(B);
			}
			sc.close();
		}

		public void findPath(int[] b) {
			Deque<Node> D = new ArrayDeque<Node>();
			D.addLast(new Node(0, 0));
			int count = -1;
			boolean[] B = new boolean[100];
			B[0] = true;
			do {
				Node n = D.removeFirst();
				Node node = null;
				// if the removed node is the final node, break and print.
				if (n.v == 99) {
					count = n.c;
					break;
				}
				// for the next six nodes
				for (int i = n.v; i < 100 && i <= n.v + 6; i++) {
					// if the next node doesn't have a ladder/snake
					if (b[i] == -1) {
						// if the node is not visited, visit it, update the
						// distance and add to the queue.
						if (!B[i]) {
							node = new Node(i, n.c + 1);
							D.addLast(node);
							B[i] = true;
						}
					} else {
						// if node has a ladder/snake and it is not visited,
						// visit and update the distance and add to the queue.
						if (!B[b[i]]) {
							node = new Node(b[i], n.c + 1);
							D.addLast(node);
							B[b[i]] = true;
						}
					}
				}
			} while (!D.isEmpty());

			System.out.println("Queue with updated distance : "+D);
			System.out.println("Using single source shortest path algorithm the optimal number of moves is : "+count);

		}

		static class Node {
			public Node(int v, int c) {
				super();
				this.v = v;
				this.c = c;
			}

			int v, c;

			@Override
			public String toString() {
				return "Node [v=" + v + ", c=" + c + "]";
			}

		}

		public int i(Scanner sc) {
			return sc.nextInt();
		}
	}
