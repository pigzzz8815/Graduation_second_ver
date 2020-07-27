package com.example.firstpage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signup.*

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signup_idck.setOnClickListener {  }

        //'가입하기' 버튼을 눌렀을 시
        //메인으로 화면이 이동함
        signup_button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        /*var dbHelper: Database = Database(applicationContext, "MEMBER.db", null, 1)


        signup_button.setOnClickListener {
            // 회원 정보를 저장하는 부분. 데이터베이스에~
            // 수정사항 : 아이디, 비밀번호, 비밀번호 확인, 이메일 란만 사용
            val id: String = signup_id.getText().toString()
            val password: String = signup_pw.getText().toString()
            val password_check: String = signup_pwck.getText().toString()
            val email: String = signup_email.getText().toString()

            if (id.length == 0 || password.length == 0 || password_check.length == 0 || email.length == 0) {
                toast("모든 정보를 입력해주세요.")
            } else {
                dbHelper.insert(id, password, password_check, email)
                toast("회원가입이 완료되었습니다.")
                startActivity(Intent(this, MainActivity::class.java))
            }*/

            // 뒤로 돌아가는 버튼 이벤트 **
            /*back2_Btn.setOnClickListener {
            startActivity<main>()
        }*/
    }
}
