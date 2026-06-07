<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Journal App — README</title>
<link href="https://fonts.googleapis.com/css2?family=DM+Mono:ital,wght@0,300;0,400;0,500;1,400&family=Playfair+Display:wght@400;600;700&family=DM+Sans:ital,opsz,wght@0,9..40,300;0,9..40,400;0,9..40,500;1,9..40,400&display=swap" rel="stylesheet">
<style>
  :root {
    --ink: #1a1a18;
    --ink-muted: #4a4a45;
    --ink-faint: #8a8a82;
    --cream: #f7f4ef;
    --cream-dark: #ede9e1;
    --accent: #2d5016;
    --accent-light: #4a7d28;
    --accent-pale: #e8f0de;
    --gold: #8b6914;
    --gold-pale: #f5edd8;
    --danger: #7a2020;
    --danger-pale: #f5e0e0;
    --mono-bg: #1e201a;
    --mono-text: #b8d4a0;
    --border: rgba(26,26,24,0.12);
    --border-strong: rgba(26,26,24,0.25);
    --radius: 6px;
    --radius-lg: 12px;
  }

  * { box-sizing: border-box; margin: 0; padding: 0; }

  body {
    font-family: 'DM Sans', sans-serif;
    background: var(--cream);
    color: var(--ink);
    font-size: 15px;
    line-height: 1.75;
    padding: 0;
  }

  /* ── HERO ─────────────────────────────────────────── */
  .hero {
    background: var(--accent);
    padding: 64px 48px 56px;
    position: relative;
    overflow: hidden;
  }
  .hero::before {
    content: '';
    position: absolute;
    inset: 0;
    background-image: repeating-linear-gradient(
      -45deg,
      transparent,
      transparent 24px,
      rgba(255,255,255,0.025) 24px,
      rgba(255,255,255,0.025) 25px
    );
  }
  .hero-inner { position: relative; max-width: 820px; }
  .hero-eyebrow {
    font-family: 'DM Mono', monospace;
    font-size: 11px;
    letter-spacing: 0.15em;
    text-transform: uppercase;
    color: rgba(255,255,255,0.55);
    margin-bottom: 16px;
  }
  .hero-title {
    font-family: 'Playfair Display', serif;
    font-size: clamp(36px, 5vw, 56px);
    font-weight: 700;
    color: #fff;
    line-height: 1.1;
    margin-bottom: 16px;
  }
  .hero-title span {
    color: #a8d080;
  }
  .hero-desc {
    font-size: 16px;
    color: rgba(255,255,255,0.72);
    max-width: 540px;
    margin-bottom: 32px;
    line-height: 1.65;
  }
  .badge-row {
    display: flex;
    flex-wrap: wrap;
    gap: 8px;
  }
  .badge {
    display: inline-flex;
    align-items: center;
    gap: 5px;
    padding: 5px 12px;
    border-radius: 999px;
    font-family: 'DM Mono', monospace;
    font-size: 11px;
    font-weight: 500;
    letter-spacing: 0.04em;
    border: 1px solid rgba(255,255,255,0.2);
    color: rgba(255,255,255,0.85);
    background: rgba(255,255,255,0.1);
  }
  .badge .dot {
    width: 6px; height: 6px;
    border-radius: 50%;
    background: #a8d080;
    flex-shrink: 0;
  }

  /* ── MAIN ─────────────────────────────────────────── */
  .main { max-width: 820px; margin: 0 auto; padding: 0 32px 80px; }

  /* ── SECTION TITLES ───────────────────────────────── */
  .section {
    margin-top: 56px;
    padding-top: 4px;
    border-top: 1.5px solid var(--border-strong);
  }
  .section-header {
    display: flex;
    align-items: baseline;
    gap: 12px;
    margin-bottom: 24px;
    padding-top: 20px;
  }
  .section-num {
    font-family: 'DM Mono', monospace;
    font-size: 11px;
    color: var(--ink-faint);
    letter-spacing: 0.08em;
  }
  .section-title {
    font-family: 'Playfair Display', serif;
    font-size: 22px;
    font-weight: 600;
    color: var(--ink);
  }

  /* ── OVERVIEW CARDS ───────────────────────────────── */
  .overview-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
    gap: 12px;
    margin-bottom: 28px;
  }
  .ov-card {
    background: #fff;
    border: 1px solid var(--border);
    border-radius: var(--radius-lg);
    padding: 18px 16px;
  }
  .ov-icon {
    font-size: 22px;
    margin-bottom: 10px;
  }
  .ov-label {
    font-size: 11px;
    font-family: 'DM Mono', monospace;
    text-transform: uppercase;
    letter-spacing: 0.1em;
    color: var(--ink-faint);
    margin-bottom: 4px;
  }
  .ov-value {
    font-size: 14px;
    font-weight: 500;
    color: var(--ink);
  }

  /* ── TECH STACK ───────────────────────────────────── */
  .tech-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(230px, 1fr));
    gap: 10px;
  }
  .tech-card {
    display: flex;
    align-items: flex-start;
    gap: 14px;
    background: #fff;
    border: 1px solid var(--border);
    border-radius: var(--radius-lg);
    padding: 16px;
  }
  .tech-icon {
    width: 38px; height: 38px;
    border-radius: 8px;
    display: flex; align-items: center; justify-content: center;
    font-size: 18px;
    flex-shrink: 0;
  }
  .tech-icon.green { background: var(--accent-pale); }
  .tech-icon.gold  { background: var(--gold-pale); }
  .tech-icon.red   { background: var(--danger-pale); }
  .tech-icon.blue  { background: #e0eaf8; }
  .tech-name {
    font-weight: 500;
    font-size: 14px;
    color: var(--ink);
    margin-bottom: 2px;
  }
  .tech-desc {
    font-size: 12.5px;
    color: var(--ink-muted);
    line-height: 1.5;
  }

  /* ── FEATURES ─────────────────────────────────────── */
  .features-list {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
    gap: 10px;
  }
  .feature-item {
    display: flex;
    align-items: flex-start;
    gap: 12px;
    padding: 14px 16px;
    background: #fff;
    border: 1px solid var(--border);
    border-radius: var(--radius-lg);
  }
  .feature-check {
    width: 20px; height: 20px;
    border-radius: 50%;
    background: var(--accent-pale);
    display: flex; align-items: center; justify-content: center;
    font-size: 11px;
    color: var(--accent);
    flex-shrink: 0;
    margin-top: 1px;
  }
  .feature-text {
    font-size: 14px;
    color: var(--ink);
    line-height: 1.5;
  }
  .feature-text strong {
    font-weight: 500;
    display: block;
    color: var(--ink);
  }
  .feature-text span {
    font-size: 12.5px;
    color: var(--ink-muted);
  }

  /* ── CODE BLOCKS ──────────────────────────────────── */
  .code-block {
    background: var(--mono-bg);
    border-radius: var(--radius-lg);
    overflow: hidden;
    margin: 16px 0;
    border: 1px solid rgba(255,255,255,0.06);
  }
  .code-header {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 10px 16px;
    border-bottom: 1px solid rgba(255,255,255,0.07);
    background: rgba(255,255,255,0.03);
  }
  .code-title {
    font-family: 'DM Mono', monospace;
    font-size: 11px;
    color: rgba(255,255,255,0.4);
    text-transform: uppercase;
    letter-spacing: 0.1em;
  }
  .code-dots { display: flex; gap: 5px; }
  .code-dots span {
    width: 10px; height: 10px; border-radius: 50%;
  }
  .code-dots .d1 { background: #ff5f57; }
  .code-dots .d2 { background: #febc2e; }
  .code-dots .d3 { background: #28c840; }
  .code-body {
    padding: 20px;
    font-family: 'DM Mono', monospace;
    font-size: 13px;
    color: var(--mono-text);
    line-height: 1.7;
    overflow-x: auto;
    white-space: pre;
  }
  .code-body .comment { color: rgba(168,208,128,0.45); font-style: italic; }
  .code-body .cmd     { color: #f0e68c; }
  .code-body .str     { color: #e8c99a; }
  .code-body .kw      { color: #c5a3ff; }

  /* ── API ENDPOINTS ────────────────────────────────── */
  .endpoint-group { margin-bottom: 28px; }
  .endpoint-group-title {
    font-family: 'DM Mono', monospace;
    font-size: 11px;
    text-transform: uppercase;
    letter-spacing: 0.12em;
    color: var(--ink-faint);
    margin-bottom: 10px;
    padding-bottom: 6px;
    border-bottom: 1px solid var(--border);
  }
  .endpoint {
    display: grid;
    grid-template-columns: 80px 1fr;
    align-items: start;
    gap: 12px;
    padding: 12px 16px;
    background: #fff;
    border: 1px solid var(--border);
    border-radius: var(--radius);
    margin-bottom: 6px;
  }
  .method {
    font-family: 'DM Mono', monospace;
    font-size: 11px;
    font-weight: 500;
    padding: 3px 8px;
    border-radius: 4px;
    text-align: center;
    letter-spacing: 0.05em;
  }
  .method.GET    { background: var(--accent-pale); color: var(--accent); }
  .method.POST   { background: #e0eaf8; color: #1a4080; }
  .method.PUT    { background: var(--gold-pale); color: var(--gold); }
  .method.DELETE { background: var(--danger-pale); color: var(--danger); }
  .endpoint-path {
    font-family: 'DM Mono', monospace;
    font-size: 13px;
    color: var(--ink);
    font-weight: 400;
  }
  .endpoint-desc {
    font-size: 12.5px;
    color: var(--ink-muted);
    margin-top: 3px;
  }
  .endpoint-right { min-width: 0; }

  /* ── PROJECT STRUCTURE ────────────────────────────── */
  .tree {
    font-family: 'DM Mono', monospace;
    font-size: 13px;
    line-height: 1.9;
    color: var(--ink-muted);
  }
  .tree .dir  { color: var(--accent); font-weight: 500; }
  .tree .file { color: var(--ink); }
  .tree .ann  { color: var(--ink-faint); font-style: italic; margin-left: 8px; }

  /* ── PREREQUISITES ────────────────────────────────── */
  .prereq-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
    gap: 10px;
  }
  .prereq-card {
    background: #fff;
    border: 1px solid var(--border);
    border-radius: var(--radius-lg);
    padding: 14px 16px;
    display: flex; align-items: center; gap: 12px;
  }
  .prereq-icon {
    font-size: 22px;
    flex-shrink: 0;
  }
  .prereq-name { font-weight: 500; font-size: 14px; }
  .prereq-ver  { font-family: 'DM Mono', monospace; font-size: 11px; color: var(--ink-faint); margin-top: 1px; }

  /* ── CALLOUT ──────────────────────────────────────── */
  .callout {
    display: flex;
    gap: 14px;
    padding: 16px 18px;
    border-radius: var(--radius-lg);
    margin: 20px 0;
  }
  .callout.info  { background: #e8f0de; border-left: 3px solid var(--accent); }
  .callout.warn  { background: var(--gold-pale); border-left: 3px solid var(--gold); }
  .callout.tip   { background: #e0eaf8; border-left: 3px solid #2060b0; }
  .callout-icon  { font-size: 18px; flex-shrink: 0; margin-top: 1px; }
  .callout-body  { font-size: 14px; color: var(--ink-muted); line-height: 1.6; }
  .callout-body strong { color: var(--ink); font-weight: 500; display: block; margin-bottom: 2px; }

  /* ── FOOTER ───────────────────────────────────────── */
  .footer {
    background: var(--mono-bg);
    color: rgba(255,255,255,0.45);
    text-align: center;
    padding: 32px 24px;
    font-family: 'DM Mono', monospace;
    font-size: 12px;
    letter-spacing: 0.04em;
  }
  .footer a { color: #a8d080; text-decoration: none; }
  .footer a:hover { text-decoration: underline; }

  /* ── UTILS ────────────────────────────────────────── */
  p { color: var(--ink-muted); font-size: 14.5px; line-height: 1.75; margin-bottom: 12px; }
  p:last-child { margin-bottom: 0; }
  strong { color: var(--ink); font-weight: 500; }

  /* Copy button */
  .copy-btn {
    font-family: 'DM Mono', monospace;
    font-size: 11px;
    color: rgba(255,255,255,0.4);
    background: transparent;
    border: 1px solid rgba(255,255,255,0.12);
    border-radius: 4px;
    padding: 2px 8px;
    cursor: pointer;
    transition: all 0.15s;
  }
  .copy-btn:hover { background: rgba(255,255,255,0.07); color: rgba(255,255,255,0.7); }
  .copy-btn.copied { color: #a8d080; border-color: rgba(168,208,128,0.4); }
</style>
</head>
<body>

<!-- ══ HERO ══════════════════════════════════════════════════════ -->
<div class="hero">
  <div class="hero-inner">
    <div class="hero-eyebrow">AchyutTripathi / Journal-App</div>
    <div class="hero-title">Journal<span>App</span></div>
    <div class="hero-desc">
      A secure, end-to-end RESTful journaling backend built with Spring Boot, MongoDB, and Spring Security — giving users a private space to write, manage, and protect their daily entries.
    </div>
    <div class="badge-row">
      <span class="badge"><span class="dot"></span>Java 17</span>
      <span class="badge"><span class="dot"></span>Spring Boot 3.5</span>
      <span class="badge"><span class="dot"></span>MongoDB</span>
      <span class="badge"><span class="dot"></span>Spring Security</span>
      <span class="badge"><span class="dot"></span>Maven</span>
      <span class="badge"><span class="dot"></span>REST API</span>
    </div>
  </div>
</div>

<!-- ══ MAIN ══════════════════════════════════════════════════════ -->
<div class="main">

  <!-- ── 01 Overview ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">01</span>
      <span class="section-title">Overview</span>
    </div>
    <div class="overview-grid">
      <div class="ov-card">
        <div class="ov-icon">📔</div>
        <div class="ov-label">Type</div>
        <div class="ov-value">REST Backend API</div>
      </div>
      <div class="ov-card">
        <div class="ov-icon">🔐</div>
        <div class="ov-label">Security</div>
        <div class="ov-value">E2EE + Spring Security</div>
      </div>
      <div class="ov-card">
        <div class="ov-icon">🗄️</div>
        <div class="ov-label">Database</div>
        <div class="ov-value">MongoDB (NoSQL)</div>
      </div>
      <div class="ov-card">
        <div class="ov-icon">☕</div>
        <div class="ov-label">Language</div>
        <div class="ov-value">Java 17</div>
      </div>
    </div>
    <p>
      JournalApp is a personal journaling REST API where users can securely create, update, and manage their journal entries. Authentication is handled via Spring Security, entries are persisted in MongoDB, and the project is built around a clean layered architecture (Controller → Service → Repository).
    </p>
  </div>

  <!-- ── 02 Tech Stack ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">02</span>
      <span class="section-title">Tech Stack</span>
    </div>
    <div class="tech-grid">
      <div class="tech-card">
        <div class="tech-icon green">🍃</div>
        <div>
          <div class="tech-name">Spring Boot 3.5</div>
          <div class="tech-desc">Application framework; auto-configured embedded Tomcat, dependency injection, REST layer.</div>
        </div>
      </div>
      <div class="tech-card">
        <div class="tech-icon red">🔒</div>
        <div>
          <div class="tech-name">Spring Security</div>
          <div class="tech-desc">Authentication & authorization; secures all endpoints with configurable filter chains.</div>
        </div>
      </div>
      <div class="tech-card">
        <div class="tech-icon green">🍃</div>
        <div>
          <div class="tech-name">Spring Data MongoDB</div>
          <div class="tech-desc">Repository abstraction over MongoDB; zero-boilerplate CRUD via MongoRepository.</div>
        </div>
      </div>
      <div class="tech-card">
        <div class="tech-icon gold">🗄️</div>
        <div>
          <div class="tech-name">MongoDB</div>
          <div class="tech-desc">Flexible document store — perfect for journal entries with varied structures and metadata.</div>
        </div>
      </div>
      <div class="tech-card">
        <div class="tech-icon gold">🔧</div>
        <div>
          <div class="tech-name">Lombok</div>
          <div class="tech-desc">Reduces boilerplate with <code style="font-family:monospace;font-size:12px">@Getter</code>, <code style="font-family:monospace;font-size:12px">@Setter</code>, <code style="font-family:monospace;font-size:12px">@Builder</code>, and more.</div>
        </div>
      </div>
      <div class="tech-card">
        <div class="tech-icon blue">📦</div>
        <div>
          <div class="tech-name">Maven</div>
          <div class="tech-desc">Build tool and dependency manager; includes Maven Wrapper for reproducible builds.</div>
        </div>
      </div>
    </div>
  </div>

  <!-- ── 03 Features ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">03</span>
      <span class="section-title">Features</span>
    </div>
    <div class="features-list">
      <div class="feature-item">
        <div class="feature-check">✓</div>
        <div class="feature-text">
          <strong>User Registration & Login</strong>
          <span>Create an account and authenticate securely via Spring Security.</span>
        </div>
      </div>
      <div class="feature-item">
        <div class="feature-check">✓</div>
        <div class="feature-text">
          <strong>Journal Entry CRUD</strong>
          <span>Create, read, update, and delete personal journal entries.</span>
        </div>
      </div>
      <div class="feature-item">
        <div class="feature-check">✓</div>
        <div class="feature-text">
          <strong>Secured Endpoints</strong>
          <span>Each user can only access their own entries — fully isolated data.</span>
        </div>
      </div>
      <div class="feature-item">
        <div class="feature-check">✓</div>
        <div class="feature-text">
          <strong>MongoDB Persistence</strong>
          <span>Schema-flexible document storage for journal data and user profiles.</span>
        </div>
      </div>
      <div class="feature-item">
        <div class="feature-check">✓</div>
        <div class="feature-text">
          <strong>Layered Architecture</strong>
          <span>Clean separation: Controller, Service, Repository, and Entity layers.</span>
        </div>
      </div>
      <div class="feature-item">
        <div class="feature-check">✓</div>
        <div class="feature-text">
          <strong>Maven Wrapper</strong>
          <span>Run builds with <code style="font-family:monospace;font-size:12px">./mvnw</code> — no local Maven install required.</span>
        </div>
      </div>
    </div>
  </div>

  <!-- ── 04 Prerequisites ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">04</span>
      <span class="section-title">Prerequisites</span>
    </div>
    <div class="prereq-grid">
      <div class="prereq-card">
        <div class="prereq-icon">☕</div>
        <div>
          <div class="prereq-name">Java JDK</div>
          <div class="prereq-ver">Version 17 or higher</div>
        </div>
      </div>
      <div class="prereq-card">
        <div class="prereq-icon">🍃</div>
        <div>
          <div class="prereq-name">MongoDB</div>
          <div class="prereq-ver">Local or Atlas cloud instance</div>
        </div>
      </div>
      <div class="prereq-card">
        <div class="prereq-icon">🐙</div>
        <div>
          <div class="prereq-name">Git</div>
          <div class="prereq-ver">Any recent version</div>
        </div>
      </div>
      <div class="prereq-card">
        <div class="prereq-icon">📦</div>
        <div>
          <div class="prereq-name">Maven</div>
          <div class="prereq-ver">Optional — mvnw wrapper included</div>
        </div>
      </div>
    </div>
  </div>

  <!-- ── 05 Getting Started ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">05</span>
      <span class="section-title">Getting Started</span>
    </div>

    <p><strong>1. Clone the repository</strong></p>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">bash</span>
        <button class="copy-btn" onclick="copyCode(this, 'git clone https://github.com/AchyutTripathi/Journal-App.git\ncd Journal-App')">copy</button>
      </div>
      <div class="code-body"><span class="cmd">git</span> clone https://github.com/AchyutTripathi/Journal-App.git
<span class="cmd">cd</span> Journal-App</div>
    </div>

    <p><strong>2. Configure MongoDB connection</strong></p>
    <p>Edit <code style="font-family:monospace;font-size:13px;background:var(--cream-dark);padding:1px 5px;border-radius:3px">src/main/resources/application.properties</code> (or <code style="font-family:monospace;font-size:13px;background:var(--cream-dark);padding:1px 5px;border-radius:3px">.yml</code>) and set your MongoDB URI:</p>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">application.properties</span>
        <button class="copy-btn" onclick="copyCode(this, 'spring.data.mongodb.uri=mongodb://localhost:27017/journaldb\nspring.data.mongodb.database=journaldb')">copy</button>
      </div>
      <div class="code-body">spring.data.mongodb.uri=<span class="str">mongodb://localhost:27017/journaldb</span>
spring.data.mongodb.database=<span class="str">journaldb</span></div>
    </div>

    <div class="callout warn">
      <div class="callout-icon">⚠️</div>
      <div class="callout-body"><strong>Never commit secrets to version control.</strong> Use environment variables or a <code style="font-family:monospace;font-size:12px">.env</code> file for production credentials. Add <code style="font-family:monospace;font-size:12px">application-local.properties</code> to your <code style="font-family:monospace;font-size:12px">.gitignore</code>.</div>
    </div>

    <p><strong>3. Build and run</strong></p>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">bash</span>
        <button class="copy-btn" onclick="copyCode(this, './mvnw spring-boot:run')">copy</button>
      </div>
      <div class="code-body"><span class="comment"># Linux / macOS</span>
<span class="cmd">./mvnw</span> spring-boot:run

<span class="comment"># Windows</span>
<span class="cmd">mvnw.cmd</span> spring-boot:run</div>
    </div>

    <div class="callout info">
      <div class="callout-icon">✅</div>
      <div class="callout-body"><strong>Server started successfully!</strong> The API will be available at <code style="font-family:monospace;font-size:12px">http://localhost:8080</code> by default.</div>
    </div>

    <p><strong>4. Run tests</strong></p>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">bash</span>
        <button class="copy-btn" onclick="copyCode(this, './mvnw test')">copy</button>
      </div>
      <div class="code-body"><span class="cmd">./mvnw</span> test</div>
    </div>
  </div>

  <!-- ── 06 API Endpoints ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">06</span>
      <span class="section-title">API Endpoints</span>
    </div>

    <div class="callout tip">
      <div class="callout-icon">💡</div>
      <div class="callout-body"><strong>Authentication required.</strong> All <code style="font-family:monospace;font-size:12px">/journal</code> routes require HTTP Basic Auth. Pass your username and password with every request.</div>
    </div>

    <div class="endpoint-group">
      <div class="endpoint-group-title">User Management — /public</div>
      <div class="endpoint">
        <div><span class="method POST">POST</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/public/create-user</div>
          <div class="endpoint-desc">Register a new user account.</div>
        </div>
      </div>
      <div class="endpoint">
        <div><span class="method GET">GET</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/public/health-check</div>
          <div class="endpoint-desc">Verify the server is running (no auth needed).</div>
        </div>
      </div>
    </div>

    <div class="endpoint-group">
      <div class="endpoint-group-title">Journal Entries — /journal (auth required)</div>
      <div class="endpoint">
        <div><span class="method GET">GET</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/journal</div>
          <div class="endpoint-desc">Retrieve all journal entries for the authenticated user.</div>
        </div>
      </div>
      <div class="endpoint">
        <div><span class="method POST">POST</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/journal</div>
          <div class="endpoint-desc">Create a new journal entry.</div>
        </div>
      </div>
      <div class="endpoint">
        <div><span class="method GET">GET</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/journal/{id}</div>
          <div class="endpoint-desc">Get a specific entry by its ID.</div>
        </div>
      </div>
      <div class="endpoint">
        <div><span class="method PUT">PUT</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/journal/{id}</div>
          <div class="endpoint-desc">Update an existing entry by ID.</div>
        </div>
      </div>
      <div class="endpoint">
        <div><span class="method DELETE">DELETE</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/journal/{id}</div>
          <div class="endpoint-desc">Delete an entry by ID (owner only).</div>
        </div>
      </div>
    </div>

    <div class="endpoint-group">
      <div class="endpoint-group-title">User Profile — /user (auth required)</div>
      <div class="endpoint">
        <div><span class="method PUT">PUT</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/user</div>
          <div class="endpoint-desc">Update the authenticated user's profile details.</div>
        </div>
      </div>
      <div class="endpoint">
        <div><span class="method DELETE">DELETE</span></div>
        <div class="endpoint-right">
          <div class="endpoint-path">/user</div>
          <div class="endpoint-desc">Delete the authenticated user's account.</div>
        </div>
      </div>
    </div>
  </div>

  <!-- ── 07 Project Structure ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">07</span>
      <span class="section-title">Project Structure</span>
    </div>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">directory tree</span>
      </div>
      <div class="code-body tree" style="white-space:pre;color:var(--mono-text)"><span class="dir">Journal-App/</span>
├── <span class="dir">src/</span>
│   └── <span class="dir">main/</span>
│       ├── <span class="dir">java/com/atripathi/journalApp/</span>
│       │   ├── <span class="dir">controller/</span><span class="ann">  ← REST endpoints</span>
│       │   ├── <span class="dir">entity/</span><span class="ann">      ← MongoDB document models</span>
│       │   ├── <span class="dir">repository/</span><span class="ann">  ← MongoRepository interfaces</span>
│       │   ├── <span class="dir">service/</span><span class="ann">     ← Business logic layer</span>
│       │   └── <span class="dir">config/</span><span class="ann">      ← Spring Security config</span>
│       └── <span class="dir">resources/</span>
│           └── <span class="file">application.properties</span>
├── <span class="dir">src/test/</span><span class="ann">            ← Unit & integration tests</span>
├── <span class="dir">.mvn/wrapper/</span><span class="ann">        ← Maven wrapper JAR</span>
├── <span class="file">mvnw</span> / <span class="file">mvnw.cmd</span><span class="ann">    ← Cross-platform build scripts</span>
├── <span class="file">pom.xml</span><span class="ann">              ← Dependencies & build config</span>
└── <span class="file">.gitignore</span></div>
    </div>
  </div>

  <!-- ── 08 Example Usage ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">08</span>
      <span class="section-title">Example Usage</span>
    </div>
    <p><strong>Register a new user</strong></p>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">curl</span>
        <button class="copy-btn" onclick="copyCode(this, `curl -X POST http://localhost:8080/public/create-user \\\n  -H 'Content-Type: application/json' \\\n  -d '{\"userName\": \"achyut\", \"password\": \"secret123\"}'`)">copy</button>
      </div>
      <div class="code-body"><span class="cmd">curl</span> -X POST http://localhost:8080/public/create-user \
  -H <span class="str">'Content-Type: application/json'</span> \
  -d <span class="str">'{"userName": "achyut", "password": "secret123"}'</span></div>
    </div>

    <p><strong>Create a journal entry</strong></p>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">curl</span>
        <button class="copy-btn" onclick="copyCode(this, `curl -X POST http://localhost:8080/journal \\\n  -u achyut:secret123 \\\n  -H 'Content-Type: application/json' \\\n  -d '{\"title\": \"Day One\", \"content\": \"Started my journaling journey today!\"}'`)">copy</button>
      </div>
      <div class="code-body"><span class="cmd">curl</span> -X POST http://localhost:8080/journal \
  -u <span class="str">achyut:secret123</span> \
  -H <span class="str">'Content-Type: application/json'</span> \
  -d <span class="str">'{"title": "Day One", "content": "Started my journaling journey today!"}'</span></div>
    </div>

    <p><strong>Retrieve all your entries</strong></p>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">curl</span>
        <button class="copy-btn" onclick="copyCode(this, 'curl -X GET http://localhost:8080/journal \\\n  -u achyut:secret123')">copy</button>
      </div>
      <div class="code-body"><span class="cmd">curl</span> -X GET http://localhost:8080/journal \
  -u <span class="str">achyut:secret123</span></div>
    </div>
  </div>

  <!-- ── 09 Contributing ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">09</span>
      <span class="section-title">Contributing</span>
    </div>
    <p>Contributions are welcome! Follow these steps:</p>
    <div class="code-block">
      <div class="code-header">
        <div class="code-dots"><span class="d1"></span><span class="d2"></span><span class="d3"></span></div>
        <span class="code-title">bash</span>
      </div>
      <div class="code-body"><span class="comment"># 1. Fork the repo on GitHub</span>
<span class="comment"># 2. Create a feature branch</span>
<span class="cmd">git</span> checkout -b feature/your-feature-name

<span class="comment"># 3. Commit your changes</span>
<span class="cmd">git</span> commit -m <span class="str">"feat: describe your change"</span>

<span class="comment"># 4. Push and open a Pull Request</span>
<span class="cmd">git</span> push origin feature/your-feature-name</div>
    </div>
    <p>Please follow standard Java/Spring Boot conventions and add tests for new features where possible.</p>
  </div>

  <!-- ── 10 Author ── -->
  <div class="section">
    <div class="section-header">
      <span class="section-num">10</span>
      <span class="section-title">Author</span>
    </div>
    <div style="display:flex;align-items:center;gap:16px;background:#fff;border:1px solid var(--border);border-radius:var(--radius-lg);padding:20px 24px;max-width:400px">
      <div style="width:52px;height:52px;border-radius:50%;background:var(--accent-pale);display:flex;align-items:center;justify-content:center;font-family:'Playfair Display',serif;font-size:20px;font-weight:700;color:var(--accent);flex-shrink:0">AT</div>
      <div>
        <div style="font-weight:500;font-size:15px;color:var(--ink)">Achyut Tripathi</div>
        <a href="https://github.com/AchyutTripathi" style="font-family:'DM Mono',monospace;font-size:12px;color:var(--accent-light);text-decoration:none">github.com/AchyutTripathi</a>
      </div>
    </div>
  </div>

</div><!-- /main -->

<!-- ══ FOOTER ═════════════════════════════════════════════════════ -->
<div class="footer">
  <div>Built with ☕ Java · 🍃 Spring Boot · 🍃 MongoDB</div>
  <div style="margin-top:8px">
    <a href="https://github.com/AchyutTripathi/Journal-App">github.com/AchyutTripathi/Journal-App</a>
  </div>
</div>

<script>
function copyCode(btn, text) {
  navigator.clipboard.writeText(text).then(() => {
    btn.textContent = 'copied!';
    btn.classList.add('copied');
    setTimeout(() => {
      btn.textContent = 'copy';
      btn.classList.remove('copied');
    }, 1800);
  });
}
</script>
</body>
</html>
