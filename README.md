# 쿠폰
쿠폰 서비스는 IGAW 쿠폰 서비스에서 발급한 쿠폰을 유저가 입력하였을 때, 리워드를 유저에게 지급하는 서비스입니다.

# Igaworks Sample 불러오기
### 방법 1
1. Click **"Download ZIP"** button
1. Unzip files
1. Open Android Studio
1. File > Open...
1. Click download folder

### 방법 2
1. Copy **"HTTPS clone URL"**
1. Open Android Studio
1. VCS > Checkout from Version Control > Git
1. Paste to Vcs Repository URL, Clone

# Coupon Sample 실행
1. IGAW 홈페이지에서 발급받은 **앱키, 해시키**를 AndroidManifest.xml 파일에 입력
1. 운영 > 쿠폰 > SDK&가상화폐연동 > 가상화폐연동 메뉴로 이동 (_개발사 자체 서버만 이용 가능_)
  * [1단계] 가상화폐 등록 메뉴에서 정보 등록
  * [2단계] 리워드 지급 콜백 서버 설정 메뉴에서 정보 등록
1. 실행
1. 운영 > 쿠폰 > 쿠폰생성 메뉴에서 쿠폰생성

# Igaworks Coupon 연동하기
연동 가이드와 샘플 프로젝트를 참고하여 연동을 진행합니다. </br>
<a href="http://help.igaworks.com/hc/ko/3_3/Content/Article/coupon_aos" target="_blank">Igaworks Coupon 연동문서 바로가기</a>

쿠폰 서비스는 리워드 지급 처리가 필요합니다.</br> 
리워드 연동은 다음문서를 참고하여 진행합니다.</br>
<a href="http://help.igaworks.com/hc/ko/3_3/Content/Article/reward_callback_server_guide" target="_blank">Reward Server 연동문서 바로가기</a>
