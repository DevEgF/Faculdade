package users

import "github.com/gin-gonic/gin"

type UserController struct {
}

func NewUsersController() *UserController {
	return &UserController{}
}

func (c *UserController) RegisterRoutes(r *gin.Engine) {
	users := r.Group("/users")

	{
		users.POST("")
		users.GET("/:id")
		users.GET("")
		users.PUT("/:id")
		users.DELETE("/:id")
	}
}
