# 4月13日～の記録
## aws 手順
##### 1.アカウント登録を以下より行う。
https://aws.amazon.com/jp/
##### 2.EC2インスタンスより、キーペアの登録をしてインスタンスを作成する
##### 3.セキュリティグループより通信の入出力の制御を行う。
SSH,Webサーバ用のHTTP,アプリケーションサーバー用のカスタムCTPポートを3000として送信元を任意の場所に設定する。
この設定により、サーバーへ入ってくる通信を必要なものだけを開くようにする。
java -jar snapshot
##### mysqlEC2インストール後ログインできない場合
1. mysqldを止める  
sudo service mysqld stop
2. 起動パラメタ変更   
sudo nano /etc/my.cnf  
[mysqld] セクションに「skip-grant-tables」追記    
3. mysqld サービス再起動  
sudo service mysqld start  
4. rootでログイン  
mysql -u root  
5. password再設定  
use mysql;  
update mysql.user set authentication_string=PASSWORD('パスワード') where user='root';  
flush privileges;
6. 起動パラを初期に戻す。  
sudo nano /etc/my.cnf  
「skip-grant-tables」を消す か コメントアウト  
7. mysqld再起動  
sudo service mysqld restart  
8. ログインテスト  　
mysql -u root -p  
