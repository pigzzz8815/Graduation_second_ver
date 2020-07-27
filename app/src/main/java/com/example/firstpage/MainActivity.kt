package com.example.firstpage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //'로그인' 버튼 눌렀을 시
        btn_login.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        //'비밀번호 찾기' 버튼을 눌렀을 시
        btn_findpw.setOnClickListener {
            setContentView(R.layout.activity_pwfind)
        }

        //'회원가입' 버튼 눌렀을 시
        btn_signup.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
            finish()
            /*val inputId = main_id.text.toString()
            val inputPw = main_pw.text.toString()

            val nextIntent = Intent(this, Signup::class.java)

            nextIntent.putExtra("아이디", inputId)
            nextIntent.putExtra("비밀번호", inputPw)

            startActivity(nextIntent)*/
        }

        /*try {
            sampleDB = this.openOrCreateDatabase(dbName, MODE_PRIVATE, null)
            //테이블이 존재하지 않으면 새로 생성합니다.
            sampleDB.execSQL("CREATE TABLE IF NOT EXISTS " + tableName
                    + " (name VARCHAR(20), phone VARCHAR(20) );")
            //테이블이 존재하는 경우 기존 데이터를 지우기 위해서 사용합니다.
            sampleDB.execSQL("DELETE FROM " + tableName  )
            //새로운 데이터를 테이블에 집어넣습니다..
            for ( i in names.indecies){
                sampleDB.execSQL("INSERT INTO " + tableName
                        + " (name, phone)  Values ('" + names[i] + "', '" + phones[i]+"');")
            }
            sampleDB.close()
        } catch (se:SQLiteException) {
            Toast.makeText(getApplicationContext(),
                se.getMessage(),
                Toast.LENGTH_LONG).show()
            Log.e("", se.getMessage())
        }
        showList()*/
    }


    /*private fun showList(){
        try {
            val ReadDB:SQLiteDatabase = this.openOrCreateDatabase(dbName, MODE_PRIVATE, null)

            //SELECT문을 사용하여 테이블에 있는 데이터를 가져옵니다..
            val c:Cursor? = ReadDB.rawQuery("SELECT * FROM " + tableName, null);
            if (c != null) {
                if (c.moveToFirst()) {
                    do {
                        //테이블에서 두개의 컬럼값을 가져와서
                        val Name = c.getString(c.getColumnIndex("name"))
                        val Phone = c.getString(c.getColumnIndex("phone"))

                        //HashMap에 넣습니다.
                        val persons:HashMap<String,String> = HashMap<String,String>();

                        persons.put(TAG_NAME,Name);
                        persons.put(TAG_PHONE,Phone);

                        //ArrayList에 추가합니다..
                        personList.add(persons);

                    } while (c.moveToNext());
                }
            }
            ReadDB.close();
            //새로운 apapter를 생성하여 데이터를 넣은 후..
            adapter = SimpleAdapter(
                this, personList, R.layout.list_item,
                arraOf(TAG_NAME,TAG_PHONE),
                arrayOf(R.id.name, R.id.phone),
            )
            //화면에 보여주기 위해 Listview에 연결합니다.
            list.setAdapter(adapter);
        } catch (se:SQLiteException) {
            Toast.makeText(getApplicationContext(),  se.getMessage(), Toast.LENGTH_LONG).show();
            Log.e("",  se.getMessage());
        }
    }*/

}
