# bboombboom

## install
### backend
#### jasypt를 이용한 DB정보 암호화
1. JasyptConfigTests 를 이용하여 암호화된 텍스트 추출
    - password,  plainText 입력 후 로그 확인
2. application.yml 파일에 암호화 된 텍스트를 아래와 같은 형식으로 ENC(암호화된 텍스트)로 입력
3. VM arguments 설정
    - Djasypt.encryptor.password= {JasyptConfigTests에 사용한 password}

### frontend
``` bash
npm intall
npm start
```

