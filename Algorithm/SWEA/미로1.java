package SWEA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로1 {
	static boolean flag;
	static Queue<int[]> q = new LinkedList<int[]>();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = Integer.parseInt(br.readLine());
		for(int t=0;t<10;t++) {
			//st = new StringTokenizer(br.readLine());
			char[][] map = new char[16][16];
			boolean[][] visit = new boolean[16][16];
			int[][] map2 = new int[16][16];
			for(int row=0;row<16;row++) {
				String str = br.readLine();
				for(int col=0;col<16;col++) {
					map[row][col] = str.charAt(col);
				}
			}
			
			for(int row=0;row<16;row++) {
				for(int col=0;col<16;col++) {
					if(map[row][col] == '2') {
						map2[row][col] = 1;
						q.add(new int[] {row,col});
						visit[row][col] = true;
					}
				}
			}
			
			System.out.println("size = " + q.size());
			
			while(!q.isEmpty()) {
				int[] dr = {-1,0,1,0}; //상 우 하 좌
				int[] dc = {0,1,0,-1};
				
				int[] current = q.poll();
				//System.out.println(current[0]); 
				//System.out.println(current[1]);
				int cr = current[0];
				int cc = current[1];
				
				for(int dir=0;dir<4;dir++) {
					int nr = cr + dr[dir];
					int nc = cc + dc[dir];
					
					if(rangeCheck(nr,nc)) {
						if(map[nr][nc] == '0' && !visit[nr][nc]) {
							q.add(new int[] {nr,nc});
							visit[nr][nc] = true;
							map2[nr][nc] = 1;
						}
						if(map[nr][nc] == '3') {
							flag =  true;
						}
						
						
					}
				}
				
				for(int row=0;row<16;row++) {
					for(int col=0;col<16;col++) {
						System.out.print(map2[row][col]+ " ");
					}
					System.out.println();
				}
				System.out.println();
				
				
				
				}
			
			if(flag) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
				
				bw.flush();
				
			}
			
		}
	private static boolean rangeCheck(int nr, int nc) {
		return nr >= 0 && nr < 16 && nc >= 0 && nc < 16;
	}
	}

