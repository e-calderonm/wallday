# WallDay

WallDay es una aplicación Android desarrollada en Kotlin con Jetpack Compose que permite a los usuarios seleccionar y administrar wallpapers desde su almacenamiento local.

## 🚀 Objetivo

Permitir que el usuario:
- Seleccione imágenes desde su dispositivo
- Visualice wallpapers agregados
- Marque favoritos
- (Futuro) Cambie automáticamente el fondo del dispositivo

## 🧱 Arquitectura

El proyecto sigue una arquitectura basada en:

- MVVM
- Clean Architecture (simplificada)
- Separación por capas: `domain`, `data`, `ui`

Estructura principal:

```
com.example.wallday
│
├── data
├── domain
├── ui
│   ├── home
│   ├── components
│   └── theme
├── di
└── worker
```

## 🛠️ Tecnologías

- Kotlin
- Jetpack Compose
- Material 3
- Android SDK 34
- Gradle Kotlin DSL

## 📌 Estado actual

✔ Proyecto base configurado  
✔ Compose funcionando  
✔ Estructura inicial de arquitectura creada  

## 📈 Roadmap

- [ ] Selección de imágenes desde galería
- [ ] Persistencia de wallpapers
- [ ] Sistema de favoritos
- [ ] Cambio automático de fondo
- [ ] Worker para wallpaper diario

## 📄 Licencia

Proyecto académico y de aprendizaje.