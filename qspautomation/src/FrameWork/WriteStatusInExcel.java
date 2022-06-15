package FrameWork;

import java.io.IOException;

public class WriteStatusInExcel {

	public static void main(String[] args) throws IOException {
		Flidge rj = new Flidge();
		rj.writeStatusInExcel("./data/test data.xlsx","Sheet1", 0, 3,"status" );
		

	}



}
