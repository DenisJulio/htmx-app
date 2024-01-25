# Devlopment

## Commands for dev mode

Watch files for recompilation:
```bash
./gradlew -t bootJar
```

Start tailwind _watch_ mode:
```bash
npx tailwindcss -i ./src/main/frontend/input.css -o ./src/main/resources/static/styles.css --watch
```

Start Spring Boot server:
```bash
./gradlew bootRun
```

> Obs:
> Maybe some docker containers or compose projects may need to be started as well.