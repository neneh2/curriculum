package exception;

import java.util.Scanner;

public class ExException{

    private static final int CONST_EXCEPTION_TRIGER_NULL = 1;
    private static final int CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS = 2;
    private static final int CONST_EXCEPTION_TRIGER_CAST = 3;

    private static final Object CONST_OBJ_FOR_CLASS_CAST = 100;

    private static final String CONST_COMMON_INIT_INFO = "\n■3-3-4:ExException 入力値「1: 続行」／「-1: 終了」";
    private static final String CONST_COMMON_TASK_INPUT_NAME = "以下の例外を発生させるためのパラメーター（1〜3）のいずれかを入力してください。\n・1: NullPointerException\n・2: ArrayIndexOutOfBoundsException\n・3: ClassCastException";
    private static final String CONST_COMMON_MSG_ERROR_EXCEPTION = "エラー: 入力値が不正です。";
    private static final String CONST_MSG_NOT_EXCEPTION_TRIGGER = "例外の発生しないパラメーターです。";
    private static final String CONST_MSG_NULLPO = "ヌルポです。";

    public static void main(String[] args) {

    	int parameter;
        int retryCounter = 0;
        Scanner sc;

        do {

        	System.out.println(CONST_COMMON_INIT_INFO);
        	sc = new Scanner(System.in);

        	try {

        		final int execute = sc.nextInt();

                // 早期処理戻し
                if (execute == -1) break;
                // オペレーションエラー
                if (execute != 1) {
                    System.out.println(CONST_COMMON_MSG_ERROR_EXCEPTION);
                    continue;
                }

        		System.out.println(CONST_COMMON_TASK_INPUT_NAME);
                parameter = sc.nextInt();

                switch (parameter) {

                	case CONST_EXCEPTION_TRIGER_NULL:
                    // 問①: 強制的に「NullPointerException」を発生させるメソッドを作成し、呼び出しなさい。
                    // 問①は最下部にもあります。
                    // ルール: ここへ作成したメソッドを呼び出す
                		nuru();
                    break;
                    case CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS:
                    // 問②: 「throw」を使用せずに「ArrayIndexOutOfBoundsException」を発生させる処理を記述しなさい。
                    // Tips: ご自身で配列を準備してください（使用する配列の型、要素数は自由）
                    int[] ar = new int[5];

                    ar [8] = 1 ;

                    break;
                    case CONST_EXCEPTION_TRIGER_CAST:
                    String castedStrValue = (String) CONST_OBJ_FOR_CLASS_CAST;
                    System.out.println(castedStrValue);
                    break;
                    default:
                    System.out.println(CONST_MSG_NOT_EXCEPTION_TRIGGER);
                    break;
                }

        	}catch (NullPointerException e) {
        		printException(e);
        	}catch (ArrayIndexOutOfBoundsException e) {
        		printException(e);
        	}catch (ClassCastException e){
        		printException(e);
        	}finally {
				System.out.println("リトライ回数　＝　" + retryCounter++);
			}

    }while (true);

        sc.close();
        System.out.println("お疲れ様でした！");

    }
    /**
     * 問①: 以下のルールに沿ってNullPointerExceptionを投げるメソッドを実装しなさい。
     * ルール1: private static void 任意のメソッド名 throws 上位へ投げるExceptionクラス名 { NullPointerExceptionを発生させる処理 }
     * ルール2: 例外発生時に設定するメッセージは、定義済みの定数から適当なものを指定してください。
     */
    private static void nuru() throws NullPointerException {

    	String str = null;

    	System.out.println(CONST_MSG_NULLPO);

    }
    /**
     * 例外処理のメッセージを出力
     *
     * @param e 発生した例外
     */
    private static void printException(final Exception e) {
        System.out.println(e);
    }

}