{\rtf1\ansi\ansicpg936\cocoartf1504\cocoasubrtf810
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww19260\viewh12360\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 Writer: Clarence Jiang \
Instructor: Daniel Gunn\
\
1 (a) public Digits(int num) \{\
		while (num>0)\{\
			int a=num%10;\
			Integer c = new Integer(a);\
			digitList.add(0, c);\
			num=num/10;\}\}\
 \
\
\
(b) public boolean isStrictlyIncreasing()\{\
	boolean c = true; \
	for( int i=1; i<digitList.size();i++)\{\
			if(digitList.get(i)<digitList.get(i-1))\{\
						c=false;\}\}\
	return c;\}\
\
\
2 public class MultPractice implements StudyPractice\{\
	\
	private int first;\
	private int second;\
	\
	public MultPractice(a, b)\{\
		first =a;\
		second =b; \}\
\
	public String getProblem()\{\
		return first+\'94 Times \'93 +second; \}\
	\
	public void nextProblem() \{\
			second++;\}\}\
\
\
3 (a) public void replaceNthOccurence(String str, int n, String real)\{\
	int count = findNthOccurence(str, n); \
	if (count !=-1) \{\
	currentPhrase = currentPhrase.substring(0, count)+real+currentPhrase.substring(count+str.length()); \}\}\
\
\
	(b)public int findLastOccurence (String str)\{\
		if (findNthOccurence(str, 1)==-1)\{\
				return -1;\}\
		int n=1;\
		while (findNthOccurence(str, n)!=-1)\{\
				n++;\}\
			return findNthOccurence(str, n-1);\}\
\
\
4 (a) public static Position findPosition(int num, int[][] intArr)\{\
	Position a= null; \
		for (int r: intArr)\{\
			for (int c: r)\{\
				if (c==num)\{a= new Position (r, c);\}\}\}\
	return a; \}\
\
    (B) public static Position[][] getSuccessorArray(int [][] intArr)\{\
		Position [][] a = new Position[intArr.length][intArr[0].length];\
			for (int r=0; r<a.length; r++)\{\
				for (int c=0; c<a[r].length; c++)\{\
					a[r][c]=findPosition((intArr[r][c]+1),intArr);\}\}\
							return a;\}\
\
\
\
	\
\
}