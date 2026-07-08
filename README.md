# GlobalPay Hub

> Cross-border payment orchestration platform MVP  
> 跨境支付聚合平台 MVP

GlobalPay Hub is a product-oriented payment orchestration project for cross-border merchants and payment operations teams.  
GlobalPay Hub 是一个面向跨境商户与支付运营场景的产品型支付编排项目。

It provides a unified layer for payment creation, channel routing, callback processing, refund handling, and basic operations management.  
它提供统一的支付下单、渠道路由、回调处理、退款流转与基础运营管理能力。

---

## Product Positioning | 产品定位

GlobalPay Hub is designed as a lightweight payment orchestration platform that helps merchants integrate multiple payment channels through one unified backend.

It is positioned as:

- a cross-border payment orchestration MVP
- a merchant-facing payment operations console
- a backend architecture practice project with real business flavor
- a product prototype that can evolve into a payment middle platform

GlobalPay Hub 被设计为一个轻量级支付编排平台，帮助商户通过统一后台接入多个支付渠道。

它的定位是：

- 跨境支付聚合与编排 MVP
- 面向商户与运营的支付管理后台
- 带真实业务味道的后端架构练手项目
- 可继续演进为支付中台的产品原型

---

## What Problem It Solves | 解决什么问题

Merchants and platform teams often face these issues:

- each payment channel has different APIs and callback formats
- routing by country, currency, and payment method becomes hard-coded quickly
- payment and refund callbacks are difficult to trace and process safely
- operations teams need one place to inspect payment and refund records

GlobalPay Hub aims to solve these with one unified orchestration layer.

商户和平台团队通常会遇到这些问题：

- 不同支付渠道接口风格不同、回调格式不同
- 国家、币种、支付方式的路由规则很容易写死在代码里
- 支付与退款回调难以追踪，也难以安全处理
- 运营和排障人员需要统一入口查看支付单与退款单

GlobalPay Hub 的目标，就是用一层统一的支付编排能力把这些问题收口。

---

## Core Capabilities | 核心能力

- Merchant login and basic authentication
- Unified payment order creation and query
- Multi-channel routing by rules
- Mock payment channel integration for MVP validation
- Callback verification and idempotent processing
- Refund request and refund callback handling
- Basic admin console for payment, refund, and routing management

- 商户登录与基础鉴权
- 统一支付单创建与查询
- 基于规则的多渠道路由
- 用于第一阶段验证的 Mock 渠道接入
- 回调验签与幂等处理
- 退款申请与退款回调处理
- 支付单、退款单、路由规则的基础后台管理

---

## MVP Scope | 第一阶段范围

The first stage focuses on the core transaction flow only:

1. Merchant login
2. Create payment order
3. Route to payment channel
4. Mock channel order creation
5. Payment callback handling
6. Payment order query
7. Refund request
8. Refund callback handling
9. Basic admin pages

第一阶段只聚焦核心交易链路：

1. 商户登录
2. 创建支付单
3. 渠道路由
4. Mock 渠道下单
5. 支付回调处理
6. 支付单查询
7. 发起退款
8. 退款回调处理
9. 基础后台页面

---

## Product Pages | 产品页面

The current prototype includes:

- Merchant login page
- Merchant dashboard
- Create payment page
- Payment list page
- Payment detail page
- Create refund page
- Refund list page
- Admin payment management page
- Admin refund management page
- Admin routing management page

当前原型包含以下页面：

- 商户登录页
- 商户控制台
- 发起支付页
- 支付单列表页
- 支付详情页
- 发起退款页
- 退款列表页
- 后台支付单管理页
- 后台退款单管理页
- 后台渠道路由管理页

Prototype location | 原型目录：

- `D:\develop\project\demo\prototype\globalpay-hub`

---

## Architecture Highlights | 架构亮点

- Channel integration is decoupled through strategy and factory patterns
- Payment and refund states are controlled by explicit transitions
- Callback processing is designed with idempotency in mind
- Routing rules are configuration-driven instead of hard-coded
- Monetary values are handled with `BigDecimal`

- 支付渠道接入通过策略模式和工厂模式解耦
- 支付状态与退款状态通过受控流转管理
- 回调处理从一开始就按幂等思路设计
- 路由规则配置化，而不是硬编码
- 金额字段统一使用 `BigDecimal`

---

## Tech Stack | 技术栈

- Java 17
- Spring Boot 3.x
- MySQL 8
- Redis
- MyBatis / MyBatis Plus
- Swagger / OpenAPI

---

## Module Overview | 模块划分

```text
com.globalpay.hub
├─ auth
├─ merchant
├─ payment
├─ refund
├─ channel
├─ routing
└─ common
```

Recommended layered structure | 推荐分层结构：

```text
controller -> service -> manager -> mapper
```

---

## Docs And Planning | 文档与规划

Planning and design documents are maintained here:

- `D:\develop\project\demo\docs\globalpay-hub`

Recommended reading order:

1. `01-项目背景与目标`
2. `04-推荐架构与技术选型`
3. `03-第一阶段开发任务清单`
4. `06-MockChannel接口设计说明`
5. `08-项目初始化与目录结构建议`

---

## Development Strategy | 开发策略

Recommended implementation order:

1. Build backend project skeleton
2. Design first-stage database tables
3. Implement payment and refund main flows
4. Implement `MockChannel`
5. Verify the workflow with Swagger / Postman
6. Add simple frontend pages for demonstration

推荐开发顺序：

1. 搭建后端项目骨架
2. 设计第一阶段数据库表
3. 实现支付与退款主链路
4. 实现 `MockChannel`
5. 使用 Swagger / Postman 验证主流程
6. 最后补简单前端页面用于演示

---

## First-Stage Completion Criteria | 第一阶段完成标准

The MVP can be considered complete when:

- merchants can log in
- payment orders can be created
- routing rules can select a channel
- the mock channel can simulate successful callbacks
- repeated callbacks do not break order state
- the refund flow is available
- payment and refund records can be queried
- admin pages support basic troubleshooting

当满足下面条件时，第一阶段 MVP 可视为完成：

- 商户可以登录
- 可以创建支付单
- 可以根据路由规则选择渠道
- Mock 渠道可以模拟成功回调
- 重复回调不会破坏订单状态
- 退款主链路可用
- 支付单与退款单可查询
- 后台页面可支持基础排障

---

## Future Evolution | 后续演进

- real channel integration such as Stripe or PayPal
- exchange rate management
- reconciliation and compensation tasks
- merchant notification retry
- risk control extensions
- operation audit logs

- 接入真实渠道，例如 Stripe / PayPal
- 汇率管理
- 对账与补偿任务
- 商户通知重试
- 风控扩展
- 操作审计日志
