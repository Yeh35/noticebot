# Event Notice Bot
채널톡에서 공지사항 같은 이벤트를 관리해주는 Bot

## 배포

### GCP
```shell
./gradlew build
docker build -t asia.gcr.io/<project-name>/noticeboot-spring .
docker push asia.gcr.io/<project-name>/noticeboot-spring
```
